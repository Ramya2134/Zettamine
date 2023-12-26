package com.zettamine.java.day7;

import java.sql.Date;

public class DateClassMethods {
	
	public static void main(String[] args) 
    { 
        Date mydate = new Date(1234567890);
  
        // Displaying the current date and time 
        System.out.println("System date : "+ mydate.toString() ); 
  
        // Is used to set time by milliseconds. Adds 15680  
        // milliseconds to January 1, 1970 to get new time. 
        mydate.setTime(15680); 
  
        System.out.println("Time after setting:  " + mydate.toString()); 
  
        int d = mydate.hashCode(); 
        System.out.println("Amount (in ms) by which time" +  
                           " is shifted :  " + d); 
    } 

}
