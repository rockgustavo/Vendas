package com.test.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource Not Found ID:"+ id);
	}

}
