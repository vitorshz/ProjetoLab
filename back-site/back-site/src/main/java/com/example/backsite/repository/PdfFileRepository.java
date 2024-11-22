package com.example.backsite.repository;

import com.example.backsite.models.PdfFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PdfFileRepository extends JpaRepository<PdfFile, Long> {
    Optional<PdfFile> findByFileName(String fileName);

}
