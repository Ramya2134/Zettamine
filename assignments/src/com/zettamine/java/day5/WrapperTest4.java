package com.zettamine.java.day5;

public class WrapperTest4 {
	public static void main(String[] args) {
		String str = "625";
		System.out.println(str + 25);
		int n = Integer.parseInt(str);
		System.out.println(n+25);
	
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
	}

}
