package com.example.webapphelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WebAppHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(WebAppHelloWorldApplication.class, args);
        System.out.println("End from main");
    }

    @Order(2)
    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("Hello from Spring Boot main!");
        };
    }
}
