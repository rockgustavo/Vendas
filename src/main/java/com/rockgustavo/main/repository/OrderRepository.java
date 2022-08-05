package com.rockgustavo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.main.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
