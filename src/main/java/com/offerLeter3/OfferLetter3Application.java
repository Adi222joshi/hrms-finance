package com.offerLeter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories

public class OfferLetter3Application {

	public static void main(String[] args) {
		SpringApplication.run(OfferLetter3Application.class, args);
		
		System.out.println(" Increment Letter Application ");
	}

}
