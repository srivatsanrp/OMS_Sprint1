package com.cg.oms.exception;

public class AdminNotFoundException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	
    public AdminNotFoundException(String message) 
    {
		super(message);
	}
}