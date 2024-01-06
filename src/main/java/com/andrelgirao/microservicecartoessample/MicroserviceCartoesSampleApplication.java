package com.andrelgirao.microservicecartoessample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCartoesSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCartoesSampleApplication.class, args);
	}

}
