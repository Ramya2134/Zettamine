package com.zettamine.java.day7;

import java.time.LocalDate;
import java.time.Month;

public class LocalDtaeMethods {
	public static void main(String[]args)
	{
		LocalDate  lo=LocalDate.now();
		System.out.println(lo);
		System.out.println(lo.getDayOfMonth());
		System.out.println(lo.getMonthValue());
		System.out.println(lo.getMonth());
		System.out.println(lo.getYear());
		System.out.println(lo.getDayOfYear());
		System.out.println(lo.getDayOfMonth());
		
		Month month=lo.getMonth();
		System.out.println(month);
	}

}
