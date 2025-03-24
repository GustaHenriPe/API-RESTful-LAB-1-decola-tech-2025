package com.dio.decola_tech_2025.domain;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().addServersItem(new Server().url("Sua nova URL"))
                .addServersItem(new Server().url("http://localhost:8080"));
    }
}
