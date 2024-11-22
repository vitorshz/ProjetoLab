package br.unipar.projetolab.utils;
import java.io.File;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {

    public static String enviarArquivo(String url, File arquivo) {
        String responseString = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost uploadFile = new HttpPost(url);

            // Monta o corpo da requisição com o arquivo
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody("file", arquivo); // Nome do campo deve corresponder ao esperado pelo servidor

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
