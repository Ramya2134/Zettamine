package com.zettamine.java.day1;

import java.util.Scanner;

public class StringConcatenation {
	static Scanner sc=new Scanner(System.in);
	public static String method(String name,String fathersName)
	{
		String s="";
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i)))
				return "Invalid name";		
		}
		for(int j=0;j<fathersName.length();j++)
		{
			if(Character.isDigit(fathersName.charAt(j)))
                return "Invalid name"; 
		}
		   s=(s+name+" "+fathersName).toUpperCase();
		   return s;
	}
	
	
	public static void main(String[]args)
	{
		System.out.println("enter the residents' name ");
		String name=sc.next();
		System.out.println("enter the father's name. ");
		String fathersName=sc.next();
		System.out.println(method(name,fathersName));
		
		
	}

}
