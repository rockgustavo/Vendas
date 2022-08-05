package com.rockgustavo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockgustavo.main.model.Product;
import com.rockgustavo.main.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
		
	}
	
	public Product findById(Long id){
		Optional<Product> product = productRepository.findById(id);
		return product.get();
		
	}
}
