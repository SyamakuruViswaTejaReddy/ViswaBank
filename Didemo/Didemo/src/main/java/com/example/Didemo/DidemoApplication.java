package com.example.Didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DidemoApplication.class, args);
		ControllerCls controllerCls= context.getBean(ControllerCls.class);
		controllerCls.display();
	}

}
