package com.zettamine.java.day8;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExam {
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("cre java","adv java","spring","spring boot","microservices");
		Stream<String> cs=list.stream();
		
//		 Stream<String> streamuppercase=cs.map(cnn->{return cnn. toUpperCase();});
//	     List<String> onstream=streamuppercase.collect(Collectors.toList());
//		 System.out.println(onstream);
		 
		 
		 
		////List<Integer> lits1=list.stream().map(string-> string.length()).collect(Collectors.toList());
		//System.out.println(lits1);
		
		List<String> list1=list.stream().map(a->String.format(" %-15s"+" - "+"%d",a, a.length())).collect(Collectors.toList());
		 
		 list1.forEach(a->System.out.println(a));
		 
		 
		 
		 
		 
		 
	}

}
