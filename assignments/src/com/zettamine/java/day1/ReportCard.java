package com.zettamine.java.day1;

import java.util.Scanner;

public class ReportCard {
	 static Scanner sc=new Scanner(System.in);
		public static  void dataEntries(int n,String s)
		{
			//Scanner sc=new Scanner(System.in);
			int arr[]=new int[n];
			int k=1;
			for(int i=0;i<n;i++)
			{
				
				System.out.println("enter the subject marks  "+k);
				k++;
				arr[i]=sc.nextInt();			
				
			}
			System.out.println("----");
			int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
			System.out.println(total);
			float avg=((float)total/7);
			System.out.println(avg);
			reportCard( s,arr,total,avg);
		}
		public static void reportCard(String s,int arr[],int total,float avg)
		{
			System.out.println("~".repeat(40));
			System.out.println("USECASE GENERATE REPORT CARD");
			System.out.println("~".repeat(40));
			System.out.println("Name:: "+s);
			System.out.println();
			int t=1;
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("subject"+ t  +"   "+ arr[i]);
				t++;
			}
			System.out.println("~".repeat(40));
			System.out.println("total: "+ total+"         "+"avg: "+avg);
			System.out.println("~".repeat(40));
			
			
		}
		
		
		public static void main(String[]args)
		{
			//Scanner sc=new Scanner(System.in);
			System.out.println("enter the student name");
			String s=sc.next();
			System.out.println("Total subjects");
			int n=sc.nextInt();
			dataEntries(n,s);
			
		}
		
		

}
