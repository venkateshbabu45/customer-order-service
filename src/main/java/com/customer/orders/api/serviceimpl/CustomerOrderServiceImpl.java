package com.customer.orders.api.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.orders.api.domain.CustomerOrders;
import com.customer.orders.api.repository.CustomerOrderRepository;
import com.customer.orders.api.service.CustomerOrderService;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

	@Autowired
	private CustomerOrderRepository customerOrderRepository;
	
	@Override
	public void createCustomerOrder(CustomerOrders customerOrders) {
		customerOrderRepository.save(customerOrders);
	}

	@Override
	public CustomerOrders findCustomerOrderById(String customerOrderId) {
		Optional<CustomerOrders> customerOrderDBObject = null;
		if(customerOrderId!=null && !customerOrderId.isEmpty()) {
			customerOrderDBObject = customerOrderRepository.findById(customerOrderId);
		}
		CustomerOrders customerOrder = new CustomerOrders();
		if(customerOrderDBObject != null) {
			customerOrder = customerOrderDBObject.get();
		}
		return customerOrder;
	}

}
