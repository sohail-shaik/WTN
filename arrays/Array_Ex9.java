package com.wipro.arrays;

public class Array_Ex9 {
	public static void main(String[] args) {
		
		int[] arr=new int[args.length]; 
		int j=0;
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++)
		{
			if(arr[i]!=10)
			{
				arr[j]=arr[i];
				//System.out.println("*");
				j++;	
			}
		}
		for(int i=j;i<args.length;i++) 
		{
			arr[i]=0;
			
		}
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(arr[i]); 
		}
	}
}
