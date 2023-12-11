package com.zettamine.java.day1;

import java.util.Scanner;

public class FindAverageAge {
	static Scanner sc=new Scanner(System.in);
	public static String calculateAverage(int arr[])
	{
		int total=0;
		if(arr.length==1)
			return "Please enter a valid employee count";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=28 && arr[i]<=40)
				total=total+arr[i];
			else
				return "Invalid age encountered!";
				
		}
		System.out.println(total);
		float avg=((float)total/arr.length);
		System.out.println("The average age is  " +avg);

		return "";
		
	}
	public static void main(String[]args)
	{
		System.out.println("enter how many employees");
		int n=sc.nextInt();
		int[] age=new int[n];
		System.out.println("enter the employee ages");
		for(int i=0;i<n;i++)
		{
			age[i]=sc.nextInt();
		}
		System.out.println(calculateAverage(age));
				
		
	}

}
