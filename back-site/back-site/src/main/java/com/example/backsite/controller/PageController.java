package com.example.backsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index"; // Nome do arquivo HTML para a página inicial
    }

    @GetMapping("/certificados")
    public String certificados() {
        return "certificados"; // Nome do arquivo HTML para certificados
    }

    @GetMapping("/convenios")
    public String convenios() {
        return "convenios"; // Nome do arquivo HTML para convênios
    }

    @GetMapping("/parceiros")
    public String parceiros() {
        return "parceiros"; // Nome do arquivo HTML para parceiros
    }

    @GetMapping("/duvidas")
    public String duvidas() {
        return "duvidas"; // Nome do arquivo HTML para dúvidas
    }

}

