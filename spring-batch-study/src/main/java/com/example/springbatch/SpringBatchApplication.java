package com.example.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringBatchApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
