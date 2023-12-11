package com.zettamine.java.day3;

import java.util.Scanner;

public class Main {
	public static void getHostellerDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Details & Hostel Details:");
		Hosteller hs=new Hosteller();
		System.out.println("Student ID");
		hs.setStudentId(sc.nextInt());
		System.out.println("Studnet Name :");
		hs.setName(sc.next());
		System.out.println("DEpartment Id ");
		hs.setDepartmentId(sc.nextInt());
		System.out.println("gender[M/F]");
		hs.setGender(sc.next());
		System.out.println("Phone number ");
		hs.setPhone(sc.next());
		System.out.println("Hostel Name:  ");
		hs.setHostelName(sc.next());
		System.out.println("Room Number :");
		hs.setRoomNumber(sc.nextInt());
		System.out.println("Modify Room Number(Y/N): ");
		String s=sc.next();
		if(s.equalsIgnoreCase("y"))
		{
			System.out.println("New Room Number: ");
			hs.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(Y/N):  ");
		String s1=sc.next();
		if(s1.equalsIgnoreCase("y"))
		{
			System.out.println("New Phone Number: ");
			hs.setPhone(sc.next());
		}
		System.out.println("~".repeat(40));
		System.out.println("The Student Details are as follows:");
		System.out.println("Student ID:" +hs.getStudentId() );
		System.out.println("Student Name: "+hs.getName());
		System.out.println("Department ID: "+hs.getDepartmentId());
		System.out.println("Student Gender: "+hs.getGender());
		System.out.println("Student Phone No: "+hs.getPhone());
		System.out.println("Hostel Name: "+hs.getHostelName());
		System.out.println("Room No: "+hs.getRoomNumber());
		
		
		
	 
	}
	public static void main(String[]args)
	{
		 getHostellerDetails();
		
	}

}
