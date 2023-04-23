package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
//  Develop a Spring Boot application that utilizes Flyway to manage database migrations.
//  Implement HTTP retry logic in a Spring application using Spring Retry library.
//  Write a utility class to convert Java objects to JSON format using the Jackson library.
//  Develop a Spring Batch job to import data from a CSV file into a database.