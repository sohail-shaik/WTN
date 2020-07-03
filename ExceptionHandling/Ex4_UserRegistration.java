package com.wipro.ExceptionHandling;

public class Ex4_UserRegistration {
	
public void registerUser(String username,String userCountry)throws InvalidCountryException{
	if (!userCountry.equals("India"))
		throw new InvalidCountryException();
	else
		System.out.println("User registration done successfully");
}


	public static void main(String[] args) {
		Ex4_UserRegistration ur=new Ex4_UserRegistration();
		try {
			ur.registerUser("John", "US");
			//ur.registerUser("Sohail", "India");
			
		} catch (InvalidCountryException e) {
			//System.out.println(e);
			
		}
	}

}
