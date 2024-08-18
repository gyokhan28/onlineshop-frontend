package com.example.onlineshop_frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OnlineshopFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineshopFrontendApplication.class, args);
	}

}
