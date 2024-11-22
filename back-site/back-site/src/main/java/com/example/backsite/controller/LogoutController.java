package com.example.backsite.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class LogoutController {

    @Operation(summary = "Logout do usuário", description = "Finaliza a sessão do usuário e redireciona para a página inicial.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Logout realizado com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Invalidar a sessão
        session.invalidate();

        // Redirecionar para a página inicial
        return "redirect:/";
    }
}
