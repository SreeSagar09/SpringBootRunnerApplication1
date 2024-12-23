package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication1Application.class, args);
		
		System.out.println("From main method in SpringBootRunnerApplication1Application class.");
	}

}
