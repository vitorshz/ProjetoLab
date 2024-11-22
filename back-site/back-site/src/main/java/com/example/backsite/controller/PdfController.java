package com.example.backsite.controller;

import com.example.backsite.models.Paciente;
import com.example.backsite.models.Pdf;
import com.example.backsite.models.PdfFile;
import com.example.backsite.repository.PacienteRepository;
import com.example.backsite.repository.PdfRepository;
import com.example.backsite.services.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/pdfs")
public class PdfController {

    @Autowired
    private PdfFileService pdfFileService;
    @Autowired
    private PdfRepository pdfRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    private final String UPLOAD_DIR = "C:\\Users\\vitor\\OneDrive\\Documentos\\GitHub\\ProjetoLab\\back-site\\back-site\\uploads\\";


    /**
     * Upload de PDF: Salva metadados em `pdfs` e conteúdo binário em `pdf_file`
     */
    @PostMapping("/upload")
    public ResponseEntity<String> uploadPdf(
            @RequestParam("file") MultipartFile file,
            @RequestParam("pacienteId") Long pacienteId) {

        try {
            // Localizar o paciente
            Optional<Paciente> pacienteOptional = pacienteRepository.findById(pacienteId);
            if (!pacienteOptional.isPresent()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado.");
            }
            Paciente paciente = pacienteOptional.get();

            // Salvar o arquivo no servidor
            File uploadFolder = new File(UPLOAD_DIR);
            if (!uploadFolder.exists()) {
                uploadFolder.mkdirs();
            }
            File dest = new File(uploadFolder, file.getOriginalFilename());
            file.transferTo(dest);

            // Salvar metadados no banco (tabela `pdfs`)
            Pdf pdf = new Pdf();
            pdf.setFileName(file.getOriginalFilename());
            pdf.setFilePath(dest.getAbsolutePath());
            pdf.setPaciente(paciente);
            pdfRepository.save(pdf);

            // Salvar conteúdo binário no banco (tabela `pdf_file`)
            PdfFile pdfFile = new PdfFile();
            pdfFile.setFileName(file.getOriginalFilename());
            pdfFile.setFileContent(file.getBytes()); // Conteúdo binário do arquivo
            pdfFileService.save(pdfFile);

            return ResponseEntity.ok("Arquivo enviado com sucesso para o paciente: " + paciente.getNome());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao enviar arquivo: " + e.getMessage());
        }
    }

    /**
     * Visualizar PDF diretamente no navegador
     */
    @GetMapping("/view/{id}")
    public ResponseEntity<byte[]> viewPdf(@PathVariable Long id) {
        Optional<PdfFile> pdfFileOptional = pdfFileService.getPdfById(id);
        if (pdfFileOptional.isPresent()) {
            PdfFile pdfFile = pdfFileOptional.get();
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                    .body(pdfFile.getFileContent());
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * Baixar PDF
     */
    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadPdf(@PathVariable Long id) {
        Optional<Pdf> pdfOptional = pdfRepository.findById(id);
        if (pdfOptional.isPresent()) {
            Pdf pdf = pdfOptional.get();
            Optional<PdfFile> pdfFileOptional = pdfFileService.getPdfByFileName(pdf.getFileName());
            if (pdfFileOptional.isPresent()) {
                PdfFile pdfFile = pdfFileOptional.get();
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + pdfFile.getFileName() + "\"")
                        .body(pdfFile.getFileContent());
            }
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * Listar PDFs por paciente
     */
    @GetMapping("/paciente/{pacienteId}/pdfs")
    public ResponseEntity<List<Pdf>> listarPdfsPorPaciente(@PathVariable Long pacienteId) {
        List<Pdf> pdfs = pdfRepository.findByPacienteId(pacienteId);
        if (pdfs.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pdfs);
    }

    /**
     * Transformar PDFs existentes no sistema em PdfFile (caso conteúdo binário esteja ausente)
     */
    @PostMapping("/convert-to-pdf-file")
    public ResponseEntity<String> convertExistingPdfsToPdfFile() {
        try {
            // Buscar PDFs na tabela `pdfs`
            List<Pdf> pdfs = pdfRepository.findAll();
            for (Pdf pdf : pdfs) {
                // Verificar se já existe um registro em `pdf_file`
                Optional<PdfFile> existingPdfFile = pdfFileService.getPdfByFileName(pdf.getFileName());
                if (existingPdfFile.isPresent()) {
                    continue; // Já convertido, ignorar
                }

                // Ler o conteúdo do arquivo físico
                File file = new File(pdf.getFilePath());
                if (!file.exists()) {
                    continue; // Arquivo não existe, ignorar
                }

                byte[] content = Files.readAllBytes(file.toPath());

                // Salvar como `PdfFile`
                PdfFile pdfFile = new PdfFile();
                pdfFile.setFileName(pdf.getFileName());
                pdfFile.setFileContent(content);
                pdfFileService.save(pdfFile);
            }

            return ResponseEntity.ok("Todos os PDFs existentes foram convertidos para PdfFile.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao converter PDFs: " + e.getMessage());
        }
    }
}

