package com.rockgustavo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.main.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
