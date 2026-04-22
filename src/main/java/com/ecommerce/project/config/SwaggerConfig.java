package com.ecommerce.project.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        SecurityScheme bearerScheme=new SecurityScheme().type(SecurityScheme.Type.HTTP).
                scheme("bearer")
                .bearerFormat("JWT")
                .description("JWT Bearer Token");
        SecurityRequirement bearerRequirement=new SecurityRequirement().
                addList("B earer Authentication");
        return new OpenAPI().info(
                new Info().title("Spring Boot ecommerce API").
                        version("7.0").
                        description("This is sample backend E-Commerce Website using SpringBoot frameWork ")
                        .license(new License().name("Apache 2.0").url("http.//embarkx.com"))
                        .contact(new Contact()
                                .name("Dhanush A D").
                                email("dhanush7438491@gmail.com")
                        )
                ).
                components(new Components()
                        .addSecuritySchemes("Bearer Authentication",bearerScheme)).
                addSecurityItem(bearerRequirement);
    }
}
