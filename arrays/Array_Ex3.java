package com.wipro.arrays;

public class Array_Ex3 {
	public static void main(String[] args) {
		int[] arr= {1,4,34,56,7};
		int a=Integer.parseInt(args[0]);
		int flag=0,k=0;
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i])
			{
				flag=1;
				k=i;
			}
		}
		if(flag==1)
			System.out.println(k);
		else 
			System.out.println("-1");
	}

}
