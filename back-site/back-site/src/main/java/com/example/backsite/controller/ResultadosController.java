package com.example.backsite.controller;

import com.example.backsite.models.Pdf;
import com.example.backsite.models.ResultadosExame;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/resultados")
public class ResultadosController {

    private final RestTemplate restTemplate;

    public ResultadosController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/{pacienteId}")
    public String listarResultadosPorPaciente(@PathVariable Long pacienteId, Model model) {
        String url = "http://localhost:8080/api/pdfs/paciente/" + pacienteId;
        ResponseEntity<Pdf[]> response = restTemplate.getForEntity(url, Pdf[].class);

        if (response.getStatusCode() == HttpStatus.OK) {
            List<Pdf> arquivos = Arrays.asList(response.getBody());
            model.addAttribute("arquivos", arquivos);
        } else {
            model.addAttribute("arquivos", Collections.emptyList());
        }

        return "resultados";
    }

}

