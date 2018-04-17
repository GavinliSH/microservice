package org.junyee.microservice.welcomeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class WelcomeServiceApplication {


	@Value("${welcomeservice.test}")
	String value;

	public static void main(String[] args) {
		SpringApplication.run(WelcomeServiceApplication.class, args);
	}

	@GetMapping("/test")
	public Object test(){
		return value;
	}


}
