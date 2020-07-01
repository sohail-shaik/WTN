package com.wipro.Inheritance;

public class Person {
	private String name;
	public Person(String n){
		this.name=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}

}
