package com.wipro.ExceptionHandling;

public class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		super();
		System.out.println("Invalid Country Exception");
		System.out.println("User Outside India  cannot be registered");
	}

}
