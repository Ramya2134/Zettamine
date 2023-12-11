package com.zettamine.java.day1;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayCharacters {
	static Scanner sc=new Scanner(System.in);
	public static void magicBoard(int arr[])
	{
	
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			char c=(char)temp;
			System.out.println(c);
		}
		
		
	}
	public static void main(String[]args)
	{
		
		System.out.println("enter any  four numbers ");
		//int n=sc.nextInt();
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		magicBoard(arr);
		
		
	}

}
