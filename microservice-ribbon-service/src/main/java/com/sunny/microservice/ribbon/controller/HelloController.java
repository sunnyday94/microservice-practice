package com.sunny.microservice.ribbon.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.microservice.ribbon.service.HelloService;

@RestController
public class HelloController {
	
	@Resource(name="helloService")
	private HelloService helloService;

	@GetMapping("/hi/{name}")
	public String getUserService(@PathVariable("name") String name) {
		return helloService.getUserServiceInfo(name);
	}
}
