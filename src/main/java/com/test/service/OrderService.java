package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Order;
import com.test.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
		
	}
	
	public Order findById(Long id){
		Optional<Order> Order = OrderRepository.findById(id);
		return Order.get();
		
	}
}
