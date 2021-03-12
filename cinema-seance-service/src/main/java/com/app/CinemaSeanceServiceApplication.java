package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CinemaSeanceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaSeanceServiceApplication.class, args);
    }

}
