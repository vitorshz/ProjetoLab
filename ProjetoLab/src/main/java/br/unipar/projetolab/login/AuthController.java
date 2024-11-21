
package br.unipar.projetolab.login;

import br.unipar.projetolab.dao.PacienteDAOImp;
import br.unipar.projetolab.models.Paciente;
import br.unipar.projetolab.DTO.
import br.unipar.projetolab.dto.LoginResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private PacienteDAOImp pacienteRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String login, @RequestParam String senha) {
        // Busca o paciente pelo login
        Paciente paciente = pacienteRepository.findByLogin(login);

        if (paciente == null) {
            // Retorna erro 404 se o paciente não for encontrado
            return ResponseEntity.status(404).body("Usuário não encontrado");
        }

        // Valida a senha
        if (!passwordEncoder.matches(senha, paciente.getSenha())) {
            // Retorna erro 401 se a senha estiver incorreta
            return ResponseEntity.status(401).body("Senha incorreta");
        }

        // Login bem-sucedido
        return ResponseEntity.ok("Login bem-sucedido!");
    }
}
