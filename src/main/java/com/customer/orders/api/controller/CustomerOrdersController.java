package com.customer.orders.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.orders.api.domain.CustomerOrders;
import com.customer.orders.api.service.CustomerOrderService;

@RestController
@RequestMapping("/customerOrders")
public class CustomerOrdersController {
	@Autowired
	private CustomerOrderService customerOrderService;
	
	@PostMapping("/create")
	public void createCustomerOrder(@RequestBody CustomerOrders customerOrder){
		customerOrderService.createCustomerOrder(customerOrder);
	}
	@GetMapping("/findById/{customerOrderId}")
	public CustomerOrders findCustomerOrderById(@PathVariable String customerOrderId) {
		
		return customerOrderService.findCustomerOrderById(customerOrderId);
	}
}
