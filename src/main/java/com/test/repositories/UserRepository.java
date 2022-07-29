package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
