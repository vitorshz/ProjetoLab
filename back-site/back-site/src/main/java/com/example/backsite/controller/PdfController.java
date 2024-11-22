package com.example.backsite.controller;

import com.example.backsite.models.PdfFile;
import com.example.backsite.services.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Controller
public class PdfController {

    @Autowired
    private PdfFileService pdfFileService;

    @GetMapping("/")
    public String listPdfs(Model model) {
        model.addAttribute("pdfs", pdfFileService.getAllPdfs());
        return "index";
    }

    @PostMapping("/upload")
    public String uploadPdf(@RequestParam("file") MultipartFile file) {
        try {
            pdfFileService.savePdf(file.getOriginalFilename(), file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
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

