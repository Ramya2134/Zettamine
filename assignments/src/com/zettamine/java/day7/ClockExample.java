package com.zettamine.java.day7;

import java.time.Clock;

public class ClockExample {
	public static void main(String[] args)
	{
		Clock c=Clock.systemDefaultZone();
		System.out.println(c);
		System.out.println("~".repeat(20));
		System.out.println(c.getZone());
		
		Clock c1=Clock.systemUTC();
		System.out.println(c1);
		System.out.println(c.instant());
	}

}
