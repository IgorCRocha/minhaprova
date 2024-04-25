package com.example.ProvaA.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.ProvaA.repository")
public class IBGEApplication {
    public static void main(String[] args) {
        SpringApplication.run(IBGEApplication.class, args);
    }
}
