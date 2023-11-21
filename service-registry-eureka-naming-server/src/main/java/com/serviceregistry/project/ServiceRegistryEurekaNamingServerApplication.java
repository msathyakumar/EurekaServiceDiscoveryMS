package com.serviceregistry.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEurekaNamingServerApplication.class, args);
	}

}
