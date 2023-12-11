package com.zettamine.java.day4;

public class Rectangle extends Shape {
	
	private int length;
	 private int breadth;
	
	
	

	

	public Rectangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		int rectArea=length*breadth;
		System.out.println(rectArea);
		
		
	}

}
