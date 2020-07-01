package com.wipro.Abstract;

import java.util.*;

public class TestCompartment {
	public static void main(String[] args) {
		Compartment c[]=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			
			int randno=rand.nextInt(4)+1;
			
			if(randno==1)
				c[i]=new FirstClass();
			else if(randno==2)
				c[i]=new Ladies();
			else if(randno==3)
				c[i]=new General();
			else if(randno==4)
				c[i]=new Luggage();
			
			String ss = c[i].notice();
			System.out.println(ss);
		}
	}

}
