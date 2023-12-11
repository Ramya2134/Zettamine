package com.zettamine.java.day2;

import java.util.Scanner;

public class Pailndrome {
	   static Scanner sc=new Scanner(System.in);
	   public static void  stringPailndrome(String name)
	   {
		   StringBuffer s1=new StringBuffer(name);
		   StringBuffer s2=new StringBuffer(name);
		   s1.reverse();
		   if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
			   System.out.println("given string is plaindrome");
		   else
			   System.out.println("given string is not plaindrome");
	   }
	
	
	        public static void main(String[]args)
			{
	    	  System.out.println("enter the name");
	    	  String name=sc.nextLine();
	    	  stringPailndrome(name);
		
		
			}
}
