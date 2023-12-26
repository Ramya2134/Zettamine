package com.zettamine.java.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingByCollect1 {
	public static void main(String[] args)
	{
		List<String> citys=Arrays.asList("Hyderabad","Bnagolre","Mumbai","OOty","Aaruku","Aamaravathi");
		
		Stream<String> city=citys.stream();
		
		List<String> noOfwords=city.map(s->String.format("%-18s -- %d", s.toUpperCase(),s.length())).collect(Collectors.toList());
		System.out.println(noOfwords);
		System.out.println("==================================");
		noOfwords.forEach(a->System.out.println(a));
		System.out.println("================================");
		for(String name : noOfwords)
		{
			System.out.println(name);
		}
		
		System.out.println("=================");
		List<String> countNo=citys.stream().map(a->a.toUpperCase()+" "+a.length()).collect(Collectors.toList());
		System.out.println(countNo);
		
	}

}
