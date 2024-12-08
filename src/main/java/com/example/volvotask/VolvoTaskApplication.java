package com.example.volvotask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VolvoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolvoTaskApplication.class, args);
    }

}
