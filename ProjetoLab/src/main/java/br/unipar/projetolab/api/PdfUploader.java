package br.unipar.projetolab.api;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class PdfUploader {

    // Método para enviar o PDF ao servidor
    public void enviarPdfParaServidor(String caminhoArquivo, Long guiaId) {
        try {
            File arquivo = new File(caminhoArquivo);

            // Verifica se o arquivo existe
            if (!arquivo.exists()) {
                System.err.println("Arquivo PDF não encontrado: " + caminhoArquivo);
                return;
            }

            // Cria o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Cria a requisição HTTP para enviar o arquivo
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/api/pdfs/upload?guiaId=" + guiaId))
                    .header("Content-Type", "application/pdf")
                    .PUT(HttpRequest.BodyPublishers.ofFile(Path.of(arquivo.getPath())))
                    .build();

            // Envia a requisição e captura a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("PDF enviado com sucesso: " + caminhoArquivo);
            } else {
                System.err.println("Erro ao enviar PDF. Código: " + response.statusCode());
                System.err.println("Detalhes: " + response.body());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao tentar enviar o PDF ao servidor.");
        }
    }
}
