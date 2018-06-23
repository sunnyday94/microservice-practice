package com.sunny.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages= {"com.sunny.microservice.user"})
@EnableEurekaClient
public class UserServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
