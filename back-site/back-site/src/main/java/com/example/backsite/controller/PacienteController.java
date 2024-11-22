package com.example.backsite.controller;

import org.springframework.ui.Model;
import com.example.backsite.models.Paciente;
import com.example.backsite.models.Pdf;
import com.example.backsite.repository.PacienteRepository;
import com.example.backsite.repository.PdfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private PdfRepository pdfRepository;

    @GetMapping("/{pacienteId}")
    public String mostrarResultados(@PathVariable Long pacienteId, Model model) {
        // Buscar informações do paciente
        Optional<Paciente> pacienteOptional = pacienteRepository.findById(pacienteId);
        if (!pacienteOptional.isPresent()) {
            return "error"; // Redirecionar para uma página de erro caso o paciente não exista
        }

        Paciente paciente = pacienteOptional.get();

        // Listar PDFs do paciente
        List<Pdf> pdfs = pdfRepository.findByPacienteId(pacienteId);

        // Adicionar dados ao modelo
        model.addAttribute("paciente", paciente);
        model.addAttribute("pdfs", pdfs);

        return "paciente"; // Retorna a página HTML Thymeleaf para o cliente
    }

}
