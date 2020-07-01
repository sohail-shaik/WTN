package com.wipro.arrays;

public class Arrays_Ex2 {
	public static void main(String args[]) {
		int[] arr={23,4,19,6,95,8};
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min) 
			{
				min=arr[i];
			}
			
		}
		System.out.println("Maximum value in the given array is : "+max);
		System.out.println("Minimum value in the given array is : "+min);
	}

}
