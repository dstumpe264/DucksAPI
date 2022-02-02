package com.stump.ducks.controller;

public class DuckNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuckNotFoundException(Integer id) {
		super("Could not find duck " + id);
	}
	
}
