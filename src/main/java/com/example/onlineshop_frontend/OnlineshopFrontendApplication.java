package com.example.onlineshop_frontend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Online-Shop-FrontEnd",
				description = "Intership-2024"
		)
)
@EnableFeignClients
public class OnlineshopFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineshopFrontendApplication.class, args);
	}

}
