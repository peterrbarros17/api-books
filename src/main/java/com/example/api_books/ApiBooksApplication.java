package com.example.api_books;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBooksApplication.class, args);
	}

}
