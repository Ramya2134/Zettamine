package com.zettamine.java.day4;

public class Circle extends Shape {
	

	 private int radius;
	 final float pie=3.14f;
	
	

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}


	


	@Override
	public void area() {
		// TODO Auto-generated method stub
	     double recArea= (radius*radius*pie);
		System.out.println("Area of circle :"+recArea);
		
	}

}
