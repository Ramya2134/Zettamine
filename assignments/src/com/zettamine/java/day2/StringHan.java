package com.zettamine.java.day2;

import java.util.Arrays;
import java.util.Scanner;

public class StringHan {
	//static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		String str1="java is a programming  language used for developing  platform  independent applicaton";
		String str="java, is! a programming* language,used for developing* platform@ independt  application";
		String[] word=str1.split(" ");
		System.out.println(word.length);
		System.out.println(Arrays.toString(word));
		
		word=str.split( "[, !*@]+");
		System.out.println(word.length);
		System.out.println(Arrays.toString(word));
		
		String s="r:m:y:m:a";
		word=s.split(":",2);
		System.out.println(Arrays.deepToString(word));
	
		
		
		
		
		
		
		
	}

}
