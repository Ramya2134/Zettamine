package com.zettamine.java.day1;

import java.util.Scanner;

public class NumberToword {
	public  static String digitTOword(int rem)
	{
		
			
			switch(rem)
			{
			case 0:
				return "Zero  ";
			case 1:
				
				return "one  ";
			case 2:
			return "two  ";
			case 3:
				return "three  ";
			case 4:
				
				return "four ";
			case 5:
				return "five  ";
			case 6:
				return "six  ";
			case 7:
				return "seven  ";
			case 8:
				return "eigth  ";
			case 9:
				return "nine  ";
				
				
			}
			
		
		return "";		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		String s2="";
		while(num>0)
		{
			int rem =num%10;
			String word=digitTOword(rem);
			s2=word+s2;
			num=num/10;
		}
		System.out.println(s2);
		sc.close();
		
		
	}


}
