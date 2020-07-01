package com.wipro.arrays;

public class Array_Ex10 {
	public static void main(String[] args) {
		
		int[] arr=new int[args.length];//1 0 1 0 0 1 1  //3 2 3 4
		int j=0;
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			if(arr[i]%2==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
