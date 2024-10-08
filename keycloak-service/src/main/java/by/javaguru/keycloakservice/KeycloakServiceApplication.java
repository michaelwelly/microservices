package by.javaguru.keycloakservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KeycloakServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakServiceApplication.class, args);
    }
}
