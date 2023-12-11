package com.zettamine.java.day2;

import java.util.Scanner;
//Student Details - Constructor
public class StudentMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter student's ID :");
		int studentId=sc.nextInt();
		System.out.println("enter student's name:");
		String studentName=sc.next();
		System.out.println("enter student address:");
		String studentAddress=sc.next();
		studentCal(studentId,studentName,studentAddress);
	}	
		public static void studentCal(int studentId,String studentName,String studentAddress)
		{
		//System.out.println("whether the studnet from NIT(yes/No):");
		//String isFromNIT=sc.next();
		while(true)
			
		{
			//if(isFromNIT.equalsIgnoreCase("yes"))
			System.out.println("whether the studnet from NIT(yes/No):");
			String isFromNIT=sc.next();
			if(isFromNIT.equalsIgnoreCase("yes"))
			{
			StudentDetails str=new StudentDetails ( studentId,studentName,studentAddress);
			System.out.println("studentID :"+ str.getStudentId());
			System.out.println("studentname : "+str.getStudentName());
			System.out.println("stdentAddress: "+str.getStudentAddress());
			System.out.println("collge name :"+str.getCollegeName());
			break;
			
			}
			
		
		 if(isFromNIT.equalsIgnoreCase("no"))
		{
			System.out.println("enter college name");
			String collegeName=sc.next();
			StudentDetails str1=new StudentDetails ( studentId,studentName,studentAddress,collegeName);
			System.out.println("studentID :"+ str1.getStudentId());
			System.out.println("studentname : "+str1.getStudentName());
			System.out.println("stdentAddress: "+str1.getStudentAddress());
			System.out.println("collge name :"+str1.getCollegeName());
			break;
		}
		
		else
		{
			System.out.println("wrong input");
			continue;
			
		}
		}
		}
}
	


