package com.example.backsite.repository;

import com.example.backsite.models.Pdf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PdfRepository extends JpaRepository<Pdf, Long> {
    List<Pdf> findByPacienteId(Long pacienteId);
}

