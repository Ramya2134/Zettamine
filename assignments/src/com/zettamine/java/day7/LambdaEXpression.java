package com.zettamine.java.day7;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEXpression {
	public static void main(String[] args)
	{
		List<String> lis=Arrays.asList("sai","ram","akhi","cherry","pappy","buny","laxmi","radha","krishna");
		System.out.println(lis);
		//Collections.sort(lis);
		
		
		/*
		 * Comparator<String> com = new Comparator<String>() {
		 * 
		 * @Override 
		 * public int compare(String s1, String s2) { int n=s1.compareTo(s2);
		 * if(n>=0) return -1; else return 1;
		 * 
		 * } };
		 */
	        
	        Collections.sort(lis,(s1,s2)->s2.compareTo(s1));
	        System.out.println(lis);
		
		
	}

}
