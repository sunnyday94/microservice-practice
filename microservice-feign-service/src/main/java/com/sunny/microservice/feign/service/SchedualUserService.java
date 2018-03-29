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
 * File Created @ [2018年3月27日, 上午11:32:15 (CST)]
 */
package com.sunny.microservice.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.sunny.microservice.feign.service.impl.SchedualUserServiceHystrix;

@FeignClient(value = "user-service", configuration = FeignClientConfiguration.class, fallback = SchedualUserServiceHystrix.class) // 指定调用哪个服务
public interface SchedualUserService {

	@GetMapping("/hi/{name}")
	public String greetingFromClientOne(@PathVariable("name") String name);
}
