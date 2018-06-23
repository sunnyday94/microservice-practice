/**
 * This class was created by sunny. It's distributed as
 * part of the microservice-feign-service Mod.
 *
 * 版权所有(C) 上海纯米电子科技有限公司 2014-2023
 * Copyright 2014-2023 CHUNMI TECHNOLOGY CO..
 *
 * This software is the confidential and proprietary information of
 * CHUNMI Corporation ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with CHUNMI.
 *
 * File Created @ [2018年3月27日, 上午11:29:38 (CST)]
 */
package com.sunny.microservice.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.microservice.feign.service.SchedualUserService;

@RestController
public class HelloController {
	
	@Autowired
	private SchedualUserService schedualUserService;

	@GetMapping("/hi/{name}")
	public String getUserServiceInfo(@PathVariable("name") String name) {
		return schedualUserService.greetingFromClientOne(name);
	}
}
