package com.customer.orders.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.orders.api.domain.CustomerOrders;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrders, String>{

}
