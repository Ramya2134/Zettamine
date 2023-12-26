package com.zettamine.java.day8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamExample {
	public static void main(String[] args)
	{
		/*
		 * List<Integer> list1=Arrays.asList(34,45,67,12); Stream<Integer>
		 * asc=list1.stream().sorted(); System.out.println(asc)
		 */;
		
		
		List<String> startWith=Arrays.asList("akhi","bhanu","shobha","anjali","ashok","saiprabha");
		List<String> list1=startWith.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		 list1.forEach(a->System.out.println(a));
		 
		 
		 
	}

}
