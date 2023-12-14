package com.zettamine.java.day4;

import java.util.Scanner;

public class VehicleLoanElgi {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the vehicleNumber");
		String vehicleNumber=sc.next();
		System.out.println("modelName");
		String modelName=sc.next();
		System.out.println("enter the vehicleType");
		String vehicleType=sc.next();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		
		Vehicle vehicle=new Vehicle(vehicleNumber,modelName,vehicleType,price);
		System.out.println(vehicle.issueLoan( vehicleType));
		//4 wheeler
		
		System.out.println(vehicle.takeInsurance(price));
		
	}
	

}
