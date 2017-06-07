package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.learning")
@EnableJpaRepositories
public class LearningByLearningApplication {

	public static void main(String[] args) {
		System.out.println("Starting spring boot applicatopn");
		SpringApplication.run(LearningByLearningApplication.class, args);
		System.out.println("application started !!!!!!!!");
	}
}
