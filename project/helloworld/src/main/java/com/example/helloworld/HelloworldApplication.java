package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloworldApplication {

	@GetMapping(value = "/hello")	
	public String getMethodName(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
