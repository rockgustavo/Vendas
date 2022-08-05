package com.rockgustavo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.main.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
