package com.example.backsite;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API do Laboratório")
                        .description("Documentação da API do sistema de gerenciamento de laboratório")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Suporte LabManager")
                                .email("suporte@labmanager.com")));
    }
}
