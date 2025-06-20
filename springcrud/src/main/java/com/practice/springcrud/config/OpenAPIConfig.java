package com.practice.springcrud.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

/*
 * configuration class for swagger api documentation
 * magic annotation springdoc-open-api-webmvc-ui...
 * 
 * @configuration simply means a class declares a bean, so spring
 * gets informed
 * a bean is spring managed object ...
 */

@Configuration
public class OpenAPIConfig {
    
    @Bean
    public OpenAPI employeeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                   .title("CRUD EMPLOYEE APPLICATION WITH ROLE-BASED ACCESS THAT USES SEEDING")
                .description("This application encapsulates proper Java coding standards, DTO usage, service-layer logic, MapStruct mapping, and role-based seeding.")
                .version("V1.0"))
            .servers(List.of(new Server().url("http://localhost:8082")));
        
    }
}
