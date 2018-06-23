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
 * File Created @ [2018年3月27日, 上午11:25:35 (CST)]
 */
package com.sunny.microservice.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages= {"com.sunny.microservice.feign"})
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class FeignServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignServiceApplication.class, args);
	}

}
