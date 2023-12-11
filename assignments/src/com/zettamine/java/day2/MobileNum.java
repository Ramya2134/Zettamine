package com.zettamine.java.day2;

import java.util.Scanner;

public class MobileNum {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[]args)
	{
		System.out.println("enter the  indian mobile number");
		String mobileNo=sc.nextLine();
		boolean isValid=checkMobileNo(mobileNo);
		System.out.println(isValid);	
		
	}


	private static boolean checkMobileNo(String mobileNo) {
		boolean checkStatus=mobileNo.matches("^[6789][0-9]{9}");
		
		
		
		return checkStatus;
	}

}
