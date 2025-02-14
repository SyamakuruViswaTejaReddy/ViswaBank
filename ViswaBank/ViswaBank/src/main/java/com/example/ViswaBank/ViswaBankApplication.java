package com.example.ViswaBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.ViswaBank.Entity")
public class ViswaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViswaBankApplication.class, args);
	}

}
