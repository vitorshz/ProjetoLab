package com.example.backsite.controller;

import com.example.backsite.models.LoginRequest;
import com.example.backsite.models.Paciente;
import com.example.backsite.repository.PacienteRepository;
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

