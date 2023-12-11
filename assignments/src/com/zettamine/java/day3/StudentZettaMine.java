package com.zettamine.java.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentZettaMine {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

      List<StudentZetta> stu=new ArrayList<StudentZetta>();
      do {
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the student name & email");
		String Name=sc.nextLine();
		String Email=sc.nextLine();
		
		
		StudentZetta sz=new StudentZetta(Name,Email);
		stu.add(sz);
		
		System.out.println("do you want add more studmets[y/n]");
		
	}while(sc.nextLine().equalsIgnoreCase("y"));
      
      System.out.println("~".repeat(50));
      System.out.println("Student ID   || STUDENT Nmae ||  Student Email              || College  Name" );
      System.out.println("=".repeat(50));
      for(StudentZetta str : stu)
      {
    	  System.out.println(str);
    	  System.out.println("-".repeat(50));
      }
      System.out.println("~".repeat(50));
      
      
      
	}

}
