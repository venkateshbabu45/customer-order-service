package com.customer.orders.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrdersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrdersServiceApplication.class, args);
	}

}
