package org.junyee.microservice.configurationserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigurationServerApplication {
	Logger logger = LoggerFactory.getLogger(ConfigurationServerApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ConfigurationServerApplication.class, args);
	}
}
