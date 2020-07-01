package com.wipro.arrays;

public class Array_Ex5 {
	public static void main(String args[]) {
		int arr[]= {21,1,7,3,5,9};
		
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		
		int min=Integer.MAX_VALUE;
		int second_min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				second_max=max;
				max=arr[i];
			}
			else if(arr[i]>second_max && arr[i]!=max)
			{
				second_max=arr[i];
			}
			if(arr[i]<min)
			{
				second_min=min;
				min=arr[i];
			}
			else if(arr[i]<second_min && arr[i]!=min)
			{
				second_min=arr[i];
			}
			
		}
		System.out.println("The array elements are: ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
			
		}System.out.println();
		
		System.out.println("Largest two numbers in given array are : "+max + " " +second_max);
		System.out.println("Smallest two numbers in given array are : "+min + " " +second_min);
	}

}
