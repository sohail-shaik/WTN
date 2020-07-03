package com.wipro.WrapperClasses;

import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s=String.format("%8s", Integer.toBinaryString(n).replace(' ','0'));
		System.out.println(s);
		sc.close();
	}
	

}
