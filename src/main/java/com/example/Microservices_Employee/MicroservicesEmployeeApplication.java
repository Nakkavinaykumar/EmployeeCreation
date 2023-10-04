package com.example.Microservices_Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients
//@ImportAutoConfiguration
public class MicroservicesEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEmployeeApplication.class, args);
		
	}
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
