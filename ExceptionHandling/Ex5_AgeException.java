package com.wipro.ExceptionHandling;

public class Ex5_AgeException {
	public static void main(String[] args)throws InvalidAgeException {
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		
		if(age<18 || age>60) {
			throw new InvalidAgeException();
			
		}
		System.out.println("Name: "+name+ " age: "+age);
	}

}
