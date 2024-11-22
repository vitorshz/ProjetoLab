package com.example.backsite.controller;

import com.example.backsite.models.PdfFile;
import com.example.backsite.services.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/pdf")
public class PdfApiController {

    @Autowired
    private PdfFileService pdfFileService;

    @GetMapping("/list")
    public List<Map<String, Object>> listPdfs() {
        List<PdfFile> pdfs = pdfFileService.getAllPdfs();
        List<Map<String, Object>> response = new ArrayList<>();

        for (PdfFile pdf : pdfs) {
            Map<String, Object> pdfData = new HashMap<>();
            pdfData.put("id", pdf.getId());
            pdfData.put("fileName", pdf.getFileName());
            response.add(pdfData);
        }

        return response;
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
}
