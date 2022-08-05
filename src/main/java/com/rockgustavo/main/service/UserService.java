package com.rockgustavo.main.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rockgustavo.main.controller.exception.DatabaseException;
import com.rockgustavo.main.model.User;
import com.rockgustavo.main.repository.UserRepository;
import com.rockgustavo.main.service.exception.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();

	}

	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));

	}

	public User insert(User obj) {
		return userRepository.save(obj);

	}

	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id); 
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage()); 
		}
	}

	public User update(Long id, User obj) {
		try {			
			User entity = userRepository.getReferenceById(id);
			updateData(entity, obj);
			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}
}
