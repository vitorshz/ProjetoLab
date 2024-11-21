/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.projetolab.login;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.nio.charset.StandardCharsets;

public class AuthService {

    private static final String API_URL = "http://localhost:8080/api/auth/login"; // URL do endpoint de login

    // Método para autenticar o usuário e obter o token JWT
    public String login(String username, String password) {
        try {
            // Cria um objeto LoginRequest com as credenciais fornecidas
            LoginRequest loginRequest = new LoginRequest(username, password);

            // Converte o objeto LoginRequest para JSON
            String credentialsJson = "{\"username\":\"" + loginRequest.getUsername() + "\",\"password\":\"" + loginRequest.getPassword() + "\"}";

            // Cria a requisição HTTP POST
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(credentialsJson, StandardCharsets.UTF_8))
                    .build();

            // Envia a requisição e recebe a resposta
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verifica se o login foi bem-sucedido (status 200)
            if (response.statusCode() == 200) {
                // Retorna o token JWT que o backend fornece
                return response.body();
            } else {
                System.err.println("Erro ao fazer login: " + response.body());
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
