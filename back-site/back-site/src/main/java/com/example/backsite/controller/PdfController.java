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


    @GetMapping("/")
    public String listPdfs(Model model) {
        model.addAttribute("pdfs", pdfFileService.getAllPdfs());
        return "index"; // Certifique-se de que este template exista
    }

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

            // Criar entrada no banco
            Pdf pdf = new Pdf();
            pdf.setFileName(file.getOriginalFilename()); // Nome do arquivo
            pdf.setFilePath(dest.getAbsolutePath());     // Caminho completo do arquivo
            pdf.setPaciente(paciente);

            pdfRepository.save(pdf);

            return ResponseEntity.ok("Arquivo enviado com sucesso para o paciente: " + paciente.getNome());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao enviar arquivo: " + e.getMessage());
        }
    }


    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadPdf(@PathVariable Long id) {
        Optional<PdfFile> pdfFile = pdfFileService.getPdfById(id);
        if (pdfFile.isPresent()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + pdfFile.get().getFileName() + "\"")
                    .body(pdfFile.get().getFileContent());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/paciente/{pacienteId}")
    public ResponseEntity<List<Pdf>> listarPdfsPorPaciente(@PathVariable Long pacienteId) {
        try {
            // Buscar PDFs relacionados ao paciente
            List<Pdf> pdfs = pdfRepository.findByPacienteId(pacienteId);
            return ResponseEntity.ok(pdfs);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

