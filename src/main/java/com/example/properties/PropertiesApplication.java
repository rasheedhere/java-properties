package com.example.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertiesApplication {

	@Autowired
	DatabaseConfiguration databaseConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}

}
