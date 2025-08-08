package com.example.PrimaryQualifierdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryQualifierdemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PrimaryQualifierdemoApplication.class, args);
		ApplicationContext context=SpringApplication.run(PrimaryQualifierdemoApplication.class, args);
		Dev dev=context.getBean(Dev.class);
		dev.code();
	}

}
