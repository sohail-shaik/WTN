package com.wipro.Overriding;

public class Fruit {
	String name,taste,size;
	public Fruit(String n,String t,String s) {
		name=n;
		taste=t;
		size=s;
	}
		void eat(){
			System.out.println(name+" "+taste);
		}
		
	}

class Apple extends Fruit{
	Apple(String n,String t,String s){
		super(n,t,s);
	}
	void eat(){
		System.out.println(name+" "+taste);
	}
}
class Orange extends Fruit{
		Orange(String n,String t,String s){
			super(n,t,s);
		}
		void eat(){
			System.out.println(name+" "+taste);
		}
}

