package com.medium.springcloud.eurekaclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServiceApplication.class, args);
	}

}