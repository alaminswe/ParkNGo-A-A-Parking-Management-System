package com.parking.parkngo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info = @Info(title = "Parking Service API"),
        servers = {
                @Server(url = "http://localhost:8080",description = "Dev Env"),
        }
)
@SpringBootApplication
public class ParkngoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkngoApplication.class, args);
    }

}
