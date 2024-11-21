
package br.unipar.projetolab.api;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.net.http.HttpHeaders;
import java.util.Map;

public class PdfUploader {

    // Método para enviar o PDF gerado para o servidor
    public void enviarPdfParaServidor(String caminhoArquivo, Long guiaId) {
        try {
            File arquivo = new File(caminhoArquivo);

            // Verifica se o arquivo existe
            if (!arquivo.exists()) {
                System.err.println("Arquivo não encontrado: " + caminhoArquivo);
                return;
            }

            // Cria a requisição HTTP PUT para enviar o PDF
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/api/pdfs/upload?guiaId=" + guiaId))  // URL do endpoint no servidor
                    .header("Content-Type", "application/pdf")  // Definindo o tipo do conteúdo
                    .PUT(HttpRequest.BodyPublishers.ofFile(Path.of(arquivo.getPath())))  // Envia o arquivo PDF
                    .build();

            // Cria o cliente HTTP e envia a requisição
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verifica a resposta do servidor
            if (response.statusCode() == 200) {
                System.out.println("PDF enviado com sucesso!");
            } else {
                System.err.println("Erro ao enviar PDF: " + response.body());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do método, após a geração do PDF
        PdfUploader uploader = new PdfUploader();
        uploader.enviarPdfParaServidor("caminho/para/o/arquivo.pdf", 123L);  // Substitua pelo caminho do seu arquivo e guiaId
    }
}