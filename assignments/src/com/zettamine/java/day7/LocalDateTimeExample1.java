package com.zettamine.java.day7;

import java.time.LocalDateTime;


public class LocalDateTimeExample1 {
	 public static void main(String[] args) {  
		    LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56); 
		    System.out.println(a.getDayOfMonth());
		    System.out.println(a.getDayOfYear());  
		    System.out.println(a.getHour());  
		    System.out.println(a.getDayOfWeek());
		    System.out.println(a.getMonthValue());
		      
		   
		    
		  }  

}