package com.sample.srr;

public class UserDefinedException extends Exception {

	private static final long serialVersionUID = 5260617126226460033L;

	private String message;
	public UserDefinedException(String message) {
		this.message = message;
	}
}
