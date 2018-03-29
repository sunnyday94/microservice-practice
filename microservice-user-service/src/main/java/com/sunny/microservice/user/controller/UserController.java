package com.sunny.microservice.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/hi/{name}")
	public String greeting(@PathVariable("name") String name) {
		 return "hi "+name+",i am from port:" +port;
	}
}
