
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
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequest) {
        // Verificar se o login existe
        Paciente paciente = pacienteRepository.findByLogin(loginRequest.getLogin());
        if (paciente == null) {
            return ResponseEntity.status(404)
                    .body(new LoginResponseDTO(false, "Usuário não encontrado"));
        }

        // Validar senha
        boolean senhaValida = passwordEncoder.matches(loginRequest.getSenha(), paciente.getSenha());
        if (!senhaValida) {
            return ResponseEntity.status(401)
                    .body(new LoginResponseDTO(false, "Senha incorreta"));
        }

        // Gerar token JWT (se necessário) e retornar sucesso
        String jwtToken = generateJwtToken(paciente); // Método fictício para gerar o token
        return ResponseEntity.ok(new LoginResponseDTO(true, "Login bem-sucedido", jwtToken));
    }

    // Exemplo de método fictício para geração de JWT
    private String generateJwtToken(Paciente paciente) {
        // Implementação de geração do token JWT
        return "exemploDeToken.jwt";
    }
}
