package com.wipro.arrays;

import java.util.Arrays;

public class Array_Ex7 {
	public static void main(String args[]) {
		int arr[]= {12,34,12,45,34,67,89}; //12 12 34 34 45 67 89
		Arrays.sort(arr);
		int len = arr.length;
		int j=0;
		for(int i=0;i<len-1;i++)
		{	
				if(arr[i]!=arr[i+1])
				{
					arr[j]=arr[i];
					j++;
				}
		}
		
		arr[j]=arr[len-1];//12 34 45 67 89
		
		for(int i=0;i<j+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
