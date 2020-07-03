package com.wipro.ExceptionHandling;

public class Ex2 {
	public static void main(String[] args) {
		int n = args.length;
		int[] arr = new int[n];
		for (int i=0;i<n;i++)
			arr[i]=Integer.parseInt(args[i]);
		
		
		int sum = 0;
		double avg = 0;
		try {
			for (int i=0;i<n;i++)
				arr[i] = Integer.parseInt(args[i]);
			
			for (int i=0;i<n;i++)
				sum += arr[i];
			
			avg = sum / n;
		} 
		catch (Exception e) {
			System.out.println("e");
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}
}
