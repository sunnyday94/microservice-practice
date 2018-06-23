package com.sunny.microservice.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("helloService")
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getUserServiceInfoError")  //@HystrixCommand注解,该注解对该方法创建了熔断器的功能
	public String getUserServiceInfo(String name) {
		return restTemplate.getForObject("http://USER-SERVICE/hi/"+name, String.class);
	}
	
	public String getUserServiceInfoError(String name) {
	       return "hi,"+name+",sorry,error!";
	}
}
