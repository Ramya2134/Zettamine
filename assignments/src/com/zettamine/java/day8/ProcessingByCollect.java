package com.zettamine.java.day8;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProcessingByCollect {
	public static void main(String[] args)
	{
		List<Integer> nums=Arrays.asList(23,2,44,56,10,78,16,99,64);
		System.out.println("original number "+nums);
		
		
		List<Integer> nums1=nums.stream().collect(Collectors.toList());
		System.out.println(nums1);
		
		List<Integer> nums2=new ArrayList<Integer>();
		/*
		 * for(int num :nums) { if(num%2==0) nums2.add(num); }
		 * System.out.println(nums2);
		 */
		
		Stream<Integer> even=nums.stream();
		
		
		
		/*
		 * Stream<Integer> evennumber=even.filter(new Predicate<Integer>(){
		 * 
		 * @Override public boolean test(Integer t) { return t%2==0; }
		 * 
		 * });
		 * 
		 * 
		 * nums2=evennumber.collect(Collectors.toList()); System.out.println(nums2);
		 */
		 
		 Stream<Integer> even1=even.filter(t->t%2==0);
		 List<Integer> eve=even1.collect(Collectors.toList());
		 System.out.println(eve);
		
		
		
	}

}
