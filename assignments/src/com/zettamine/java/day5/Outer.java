package com.zettamine.java.day5;

public class Outer {
	static int n=12;
	static  class Inner
	{
		public static void area(int x) {
			System.out.println("area is "+(Math.round(3.14*x*x)));
			System.out.println(x);
		}
		
	}
}
	
