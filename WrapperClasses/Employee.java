package com.wipro.WrapperClasses;

public class Employee implements Cloneable{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (Exception e) {
			System.out.println(e);
			return this;
		}	
	}

}
