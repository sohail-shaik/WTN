package com.wipro.WrapperClasses;

public class Ex4 {
	public static void main(String[] args) {
		Employee emp=new Employee("John Wick");
		Employee empClone=emp.clone();
		
		empClone.setName("Tony Stark");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
