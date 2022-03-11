/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Day5UserDefinedExceptionClass extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public Day5UserDefinedExceptionClass(String message) {
		super(message);
		this.message = message;
	}
//	public String toString()
//	{
//	return "(" + message +") is less than Ten";
//	}
	

}
