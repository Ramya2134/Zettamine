package com.zettamine.java.day4;

import java.util.Scanner;

public class StudentHosteller {
	static Scanner sc=new Scanner(System.in);
	public static void main(String aregs[])
	{
		System.out.println("enter the student and hosteller details");
		System.out.println("enter the student Id");
		int studentId=sc.nextInt();
		System.out.println("enter the studnet name");
		String name=sc.next();
		System.out.print("enter the department Id");
		int departmentId=sc.nextInt();
		System.out.println("Gender[M/F]:  ");
		String gender=sc.next();
		System.out.println("enter the phone number");
		
		String phone =sc.next();
		System.out.println("Hosteller Name");
		String hostelName=sc.next();
		System.out.println("Room Number");
		int roomNumber=sc.nextInt();
		Student studnet=new Hosteller(studentId,name,departmentId,gender,phone,hostelName,roomNumber);
		/*System.out.println("Modify the room number[y/n]");
		String modify=sc.next();
		
		System.out.println("Modify Phone Number(Y/N");
		String modPh=sc.next();
		*/
		//getHostellerDetails(studnet,modify,modPh);
		getHostellerDetails(studnet);
		
		
		System.out.println("The student deatils as follow");
	    System.out.println("============================");
	    System.out.println("student Id :"+studnet.getStudentId());
	    System.out.println("Student Name:  "+studnet.getName());
	    System.out.println("Department Id:  "+studnet.getDepartmentId());
	    System.out.println("Student Gender :"+studnet.getGender());
	    System.out.println("Student Phone No :"+studnet.getPhone());
	    System.out.println("Hostel Name: "+((Hosteller)studnet). getHostelName());
	    System.out.println("Room No:  "+((Hosteller)studnet).getRoomNumber());
		
		
	}
	public static Hosteller getHostellerDetails( Student student )
	{
		System.out.println("Modify the room number[y/n]");
		String modify=sc.next();
		if(modify.equalsIgnoreCase("y"))
		{
			System.out.println("new Room number :");
			int newRoom=sc.nextInt();
			((Hosteller)student).setRoomNumber(newRoom);
		}
		System.out.println("Modify Phone Number(Y/N");
		String modPh=sc.next();
		
		
	    if(modPh.equalsIgnoreCase("y"))
	    {
	    	System.out.println("New Phone NUmber");
	    	String nph=sc.next();
	    	((Hosteller)student).setPhone(nph);
	    }
	    
	    return  (Hosteller)student;
		
		
	    
	}
	 

}
