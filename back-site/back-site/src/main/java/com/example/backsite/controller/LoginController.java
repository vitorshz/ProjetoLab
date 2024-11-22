package com.example.backsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Lógica de autenticação aqui
        if (username.equals("admin") && password.equals("1234")) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Usuário ou senha inválidos");
            return "login";
        }
    }
}
