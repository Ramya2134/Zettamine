package com.zettamine.java.day7;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayExample1 {
	public static void main(String[] args)

	{
		MonthDay monthday=MonthDay.now();
		System.out.println(monthday);
		
		LocalDate date=monthday.atYear(2001);
		System.out.println(date);
		
		
		MonthDay monthday2 = MonthDay.now();
		boolean b = monthday2.isValidYear(2001);
		System.out.println(b);
		
		
	}
}
