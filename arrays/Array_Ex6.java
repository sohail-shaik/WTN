package com.wipro.arrays;

public class Array_Ex6 {
	public static void main(String args[]) {
		int arr[]= {21,19,1,5,75,8};
		int temp;
		for(int i=0;i<arr.length;i++) 
		{ 
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("The sorted order is :");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
