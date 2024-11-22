package com.example.backsite.controller;

import com.example.backsite.models.LoginRequest;
import com.example.backsite.models.Paciente;
import com.example.backsite.repository.PacienteRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Operation(summary = "Autenticar Paciente", description = "Autentica um paciente pelo CPF.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Autenticação bem-sucedida, retorna o ID do paciente."),
            @ApiResponse(responseCode = "401", description = "CPF inválido."),
            @ApiResponse(responseCode = "404", description = "Paciente não encontrado.")
    })
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Buscar paciente pelo CPF
        Optional<Paciente> optionalPaciente = pacienteRepository.findByCpf(loginRequest.getCpf());

        if (optionalPaciente.isPresent()) {
            Paciente paciente = optionalPaciente.get();

            // Verificar se o CPF informado é igual ao CPF do banco
            if (paciente.getCpf().equals(loginRequest.getCpf())) {
                // Retornar o ID do paciente para o frontend redirecionar
                return ResponseEntity.ok("/paciente/" + paciente.getId());
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("CPF inválido");
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado");
        }
    }

}

