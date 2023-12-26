package com.zettamine.java.day8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;
public class AverageTest {
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(23,45,1,2,56,78);
		
		IntSummaryStatistics stats=list.stream().mapToInt(n-> Integer.valueOf(n)).summaryStatistics();
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getClass());
		
		
		
	}

}
