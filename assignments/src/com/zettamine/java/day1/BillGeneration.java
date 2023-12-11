package com.zettamine.java.day1;

import java.util.Scanner;

import lombok.Data;
@Data
public class BillGeneration {
	static Scanner sc=new Scanner(System.in);
	public static void billDetails(int p,int pu,int c)
	{
		int pizzaCost=100;
		int puffCost=20;
		int coolDrik=10;
		System.out.println("~".repeat(40));
		System.out.println("biil details");
		System.out.println("No of pizza:  "+p+" "+"Cost:"+p*pizzaCost);
		System.out.println("No of puffs:  "+pu+" "+"cost: "+pu*puffCost);
		System.out.println("No of cool driks: "+c+" "+"cost: "+c*coolDrik);
		int total=p*pizzaCost+pu*puffCost+c*coolDrik;
		
		System.out.println("total price: "+total);
		System.out.println("ENJOY THE SHOW!!!");
		
	}
	
	
	public static void main(String[]args)
	
	{
		System.out.println(" Enter the no of pizzas bought");
		int p=sc.nextInt();
		System.out.println("Enter the no of puffs bought");
		int pu=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought");
		int c=sc.nextInt();
		billDetails(p,pu,c);
	}


}
