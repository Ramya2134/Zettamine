package com.zettamine.java.day7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
	public static void main(String[]args)
	{
			LocalDateTime dt=LocalDateTime.now();
			System.out.println(dt);
			
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
			String for1=dt.format(formatter);
					System.out.println(for1);
	}
	

}
