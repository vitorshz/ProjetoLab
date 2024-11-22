package br.unipar.projetolab.utils;
import java.io.File;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {

    public static String enviarArquivo(String url, File arquivo, Long pacienteId) {
        String responseString = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost uploadFile = new HttpPost(url);

            // Monta o corpo da requisição com o arquivo e o pacienteId
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody("file", arquivo); // Adiciona o arquivo
            builder.addTextBody("pacienteId", String.valueOf(pacienteId)); // Adiciona o ID do paciente

            HttpEntity multipart = builder.build();
            uploadFile.setEntity(multipart);

            // Executa a requisição
            HttpResponse response = httpClient.execute(uploadFile);
            HttpEntity responseEntity = response.getEntity();

            if (responseEntity != null) {
                responseString = EntityUtils.toString(responseEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseString = "Erro ao enviar arquivo: " + e.getMessage();
        }
        return responseString;
    }
    public static String enviarArquivoComPaciente(String url, File arquivo, Long pacienteId) {
        String responseString = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost uploadFile = new HttpPost(url);

            // Monta o corpo da requisição com o arquivo e o ID do paciente
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody("file", arquivo, ContentType.APPLICATION_OCTET_STREAM, arquivo.getName());
            builder.addTextBody("pacienteId", String.valueOf(pacienteId), ContentType.TEXT_PLAIN);

            HttpEntity multipart = builder.build();
            uploadFile.setEntity(multipart);

            // Executa a requisição
            HttpResponse response = httpClient.execute(uploadFile);
            HttpEntity responseEntity = response.getEntity();

            if (responseEntity != null) {
                responseString = EntityUtils.toString(responseEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseString = "Erro ao enviar arquivo: " + e.getMessage();
        }
        return responseString;
    }
}
