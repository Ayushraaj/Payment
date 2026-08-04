package com.Eureka_server2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2Application {
	
	@Value("${server.port}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer2Application.class, args);
		
	}
	
	@PostConstruct
	public void serverDetail() {
		System.out.println("Eureka server-2 has started at port :"+ port);
	}

}
