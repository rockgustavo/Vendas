package com.rockgustavo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.main.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
