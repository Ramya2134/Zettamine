package com.zettamine.java.day4;

public abstract class Shape {
	private String colour;
	
	
	
	



	public Shape(String colour) {
		super();
		this.colour = colour;
	}







	public String getColour() {
		return colour;
	}







	public void setColour(String colour) {
		this.colour = colour;
	}







	public abstract void area();
	
	

}
