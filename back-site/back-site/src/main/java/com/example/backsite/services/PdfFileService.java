package com.example.backsite.services;

import com.example.backsite.models.PdfFile;
import com.example.backsite.repository.PdfFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PdfFileService {

    @Autowired
    private PdfFileRepository pdfFileRepository;

    public void savePdf(String fileName, byte[] content) {
        PdfFile pdf = new PdfFile();
        pdf.setFileName(fileName);
        pdf.setFileContent(content);
        pdfFileRepository.save(pdf);
    }

    public List<PdfFile> getAllPdfs() {
        return pdfFileRepository.findAll();
    }

    public Optional<PdfFile> getPdfById(Long id) {
        return pdfFileRepository.findById(id);
    }
    public PdfFile save(PdfFile pdfFile) {
        return pdfFileRepository.save(pdfFile);
    }

    // Método para buscar o conteúdo do PDF pelo nome do arquivo
    public Optional<PdfFile> getPdfByFileName(String fileName) {
        return pdfFileRepository.findByFileName(fileName);
    }

}

