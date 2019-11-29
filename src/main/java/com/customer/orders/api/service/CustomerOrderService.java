package com.customer.orders.api.service;

import com.customer.orders.api.domain.CustomerOrders;

public interface CustomerOrderService {
	public void createCustomerOrder(CustomerOrders customerOrders);
	
	public CustomerOrders findCustomerOrderById(String customerOrderId);
}
