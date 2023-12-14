package com.zettamine.java.day5;

public class BoxingVsWidening {
	/*void method(int n)
	{
		System.out.println("1st argmment method");
	}
	*/
	void method(double n)
	{
		System.out.println("2nd argument method");
	}
	void method(float n)
	{
		System.out.println("3rd argument method");
	}
	/*
	void method(long n)
	{
		System.out.println("4th argument method");
	}
	*/
	void method(Integer n)
	{
		System.out.println("5th argument method");
	}
	public static void main(String[] args)
	{
		BoxingVsWidening obj=new BoxingVsWidening();
		obj.method(45);
	}

}
