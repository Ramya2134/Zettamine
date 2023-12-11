package com.zettamine.java.day4;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class DrawingApp {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("which shape do want  to work with[1.Recantagle | 2.Circle | 3.Traingle");
		int option=sc.nextInt();
		Shape s=null;
		switch(option)
		{
		case 1:
			
			System.out.println("enter the colour of rectangle");
			String colour=sc.next();
			System.out.println("enter the length and bredath of the rectangle");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			s=new Rectangle(colour,length,breadth);
			break;
		case 2:
			
			System.out.println("enter the colour of circle");
			String colour1=sc.next();
			System.out.println("enter the radius of circle");
			int radius=sc.nextInt();
			s=new Circle(colour1,radius);
			break;
		case 3:
			
			System.out.println("enter the  colour traingle ");
			String colour2=sc.next();
			System.out.println("enter the height and base of traingle");
			int height=sc.nextInt();
			int base=sc.nextInt();
			s=new Triangle(colour2,height,base);
			break;
		default:
			System.out.println("invalid shape selection :: try again --- close the app");
				
		}	
		getDetails(s);
		
	}
	private static void getDetails(Shape s)
	{
		if(s instanceof Rectangle)
		{
			System.out.println("=====shape selected : Rectangle"+s.getClass().getSimpleName()+"=".repeat(10));
			System.out.println("colour of rectangle :"+s.getClass().getSimpleName()+"is: "+s.getColour());
			System.out.println("change the colour");
			String changeColour=sc.next();
			if(changeColour.equalsIgnoreCase("yes"))
			{
				System.out.print("Enter updated color:");
				String upcolor=sc.next();
				s.setColour(upcolor);
				System.out.println("updated  color of"+s.getClass().getSimpleName()+"is :"+s.getColour());
				
				
				s.area();
				
			}
			else {
				System.out.println("invalid input");
			}
			
			
		}
	}
	
	
	

}
