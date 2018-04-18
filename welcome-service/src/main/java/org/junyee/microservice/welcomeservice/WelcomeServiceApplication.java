package org.junyee.microservice.welcomeservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableCircuitBreaker
public class WelcomeServiceApplication {


	@Value("${welcomeservice.test}")
	String value;

	public static void main(String[] args) {
		SpringApplication.run(WelcomeServiceApplication.class, args);
	}

	@GetMapping("/test")
	@HystrixCommand(fallbackMethod = "hystrixMsg")
	public Object test(){
		return value;
	}
	public String hystrixMsg() {
		return "error";
	}

}
