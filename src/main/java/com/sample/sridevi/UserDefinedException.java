package com.sample.sridevi;

public class UserDefinedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7848335848453055091L;
	
	private String message;
	

	public UserDefinedException(String message) {
		this.message = message;
	}
}
