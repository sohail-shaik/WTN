package com.wipro.arrays;

public class Array_Ex8 {
	public static void main(String[] args) {
		
		int a=6,b=7,sum=0;
		boolean add=true;
		int[] arr=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++) {
			if(arr[i]!=a && add==true)
			{
				sum+=arr[i];
			}
			else if(arr[i]==a)
				add=false;
			else if(arr[i]==b)
				add=true;
		}
		if(arr[arr.length-1]==a)
			sum+=arr[arr.length-1];
		System.out.println(sum);
		
	}

}
