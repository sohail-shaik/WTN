package com.wipro.ExceptionHandling;

import java.io.*;
import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr=new int[n];
		try {
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			System.out.println("Enter the index of the array element you want to access");
			int index=sc.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully asserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
