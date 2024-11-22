package com.example.backsite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login", "/css/**", "/js/**", "/img/**", "/api/pdf/**").permitAll() // Permite acesso sem autenticação
                        .anyRequest().authenticated() // Requer autenticação para outras rotas
                )
                .formLogin(login -> login
                        .loginPage("/login") // Página de login personalizada
                        .defaultSuccessUrl("/") // Redireciona após login bem-sucedido
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login") // Redireciona para login após logout
                        .permitAll()
                );

        return http.build();
    }
}
