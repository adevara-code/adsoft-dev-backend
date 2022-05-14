package com.adsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.adsoft.*")
@ComponentScan("com.adsoft.*")
@EntityScan(basePackages = "com.adsoft.*")
public class SpringBootOracleRestCrudApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootOracleRestCrudApplication starts main method");
		SpringApplication.run(SpringBootOracleRestCrudApplication.class, args);
		System.out.println("SpringBootOracleRestCrudApplication ends main method");

	}

}
