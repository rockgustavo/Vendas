package com.rockgustavo.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockgustavo.main.model.Category;
import com.rockgustavo.main.repository.CategoryRepository;


@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
		
	}
	
	public Category findById(Long id){
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
		
	}
}
