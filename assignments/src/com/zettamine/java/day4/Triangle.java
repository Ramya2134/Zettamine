package com.zettamine.java.day4;

public class Triangle  extends Shape{

	private int heigth;
	private int base;
	
	
	public Triangle(String colour, int heigth, int base) {
		super(colour);
		this.heigth = heigth;
		this.base = base;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		int traiArea=heigth*base;
		System.out.println("Area of traingle is"+traiArea);
		
	}

}
