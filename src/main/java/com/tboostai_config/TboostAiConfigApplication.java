package com.tboostai_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TboostAiConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TboostAiConfigApplication.class, args);
	}

}
