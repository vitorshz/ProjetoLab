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

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> downloadResultado(@PathVariable Long id) {
        ResultadosExame resultado = resultadosExameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resultado não encontrado"));

        return ResponseEntity.ok()
                .header("Content-Type", "application/pdf")
                .header("Content-Disposition", "inline; filename=resultado.pdf")
                .body(resultado.getPdfResultado());
    }


    @PostMapping
    public ResponseEntity<ResultadosExame> salvarResultado(@RequestBody ResultadosExame resultadoExame) {
        return ResponseEntity.ok(resultadosExameService.salvar(resultadoExame));
    }

    @GetMapping("/guia/{guiaId}")
    public ResponseEntity<List<ResultadosExame>> buscarPorGuia(@PathVariable Long guiaId) {
        return ResponseEntity.ok(resultadosExameService.buscarPorGuiaId(guiaId));
    }

    @GetMapping("/exame/{exameId}")
    public ResponseEntity<List<ResultadosExame>> buscarPorExame(@PathVariable Long exameId) {
        return ResponseEntity.ok(resultadosExameService.buscarPorExameId(exameId));
    }

    @GetMapping("/guia/{guiaId}/exame/{exameId}")
    public ResponseEntity<List<ResultadosExame>> buscarPorGuiaEExame(@PathVariable Long guiaId, @PathVariable Long exameId) {
        return ResponseEntity.ok(resultadosExameService.buscarPorGuiaEExame(guiaId, exameId));
    }
}

