package com.zettamine.java.day5;

public class Method1 {
	static void method(Number I)
	{
		System.out.println("Integer wrapper  type");
	}
	static void method(Long I)
	{
		System.out.println("long primitive type");
	}
	static void method(int...i)
	{
		System.out.println("INteger");
		
	}
	public static void main(String[] args)
	{
		int n=12;
		method(n);
		short s1=30,s2=40;
		method(s1,s2);
		
	}

}
