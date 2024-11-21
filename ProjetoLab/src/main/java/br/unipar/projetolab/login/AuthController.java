package br.unipar.projetolab.login;

import br.unipar.projetolab.dao.PacienteDAOImp;
import br.unipar.projetolab.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private PacienteDAOImp pacienteRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    // DTO para encapsular os dados de login
    public static class LoginDTO {
        private String login;
        private String senha;

        // Getters and Setters
        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }

    // Endpoint de login
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        // Verifica se o paciente existe no banco
        Paciente paciente = pacienteRepository.findByLogin(loginDTO.getLogin());

        if (paciente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        }

        // Verifica se a senha informada é correta
        if (passwordEncoder.matches(loginDTO.getSenha(), paciente.getSenha())) {
            // Autentica o usuário e retorna um token JWT (futuramente você pode implementar o JWT)
            UsernamePasswordAuthenticationToken authenticationToken = 
                new UsernamePasswordAuthenticationToken(paciente.getLogin(), paciente.getSenha());

            Authentication authentication = authenticationManager.authenticate(authenticationToken);

            SecurityContextHolder.getContext().setAuthentication(authentication);
            
            // A seguir, você pode gerar um token JWT para o usuário autenticado (não implementado aqui)
            // Exemplo de resposta com sucesso sem token:
            return ResponseEntity.ok("Login bem-sucedido!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Senha incorreta");
        }
    }
}
