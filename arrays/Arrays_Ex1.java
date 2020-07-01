package com.wipro.arrays;

public class Arrays_Ex1 {
	public static void main(String args[]) {
		int a[]= {1,2,3,4};
		int sum=0,n=a.length;
		double avg=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		
		System.out.println("Sum of given array elements is :"+sum);
		System.out.println("Average of given array elements is :"+ avg);
	}

}
