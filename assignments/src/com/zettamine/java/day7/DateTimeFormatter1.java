package com.zettamine.java.day7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {
	public static void main(String[] args)
	{
		LocalDateTime dateobj = LocalDateTime.now();
		System.out.println("Before formatting   :"+dateobj);
		
		System.out.println("~".repeat(20));
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
		System.out.println(format);
		
		System.out.println("~".repeat(20));
	    String formattedDate  =  dateobj.format(format);
		System.out.println("After formatting: " + formattedDate);
		
		/*
		 * The ofPattern() method accepts all sorts of values,
		 *  if you want to display the date and time in a different format. 
		 
		 */
		
	}

}
