package com.cloudnative.eureksservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureksServiceApplication.class, args);
	}
}
