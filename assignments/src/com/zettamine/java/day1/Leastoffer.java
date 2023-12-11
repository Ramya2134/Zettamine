package com.zettamine.java.day1;
import java.util.Scanner;

public class Leastoffer {
	
	
	static Scanner sc=new Scanner(System.in);
	public static void discountOffer(String[] itemName,int[] price,int[] discount)
	{
		for(int j=0;j<price.length;j++)
		{
			System.out.println(itemName[j]+", "+price[j]+", "+discount[j]);
		}
		int dicount1[]=new int[price.length];
		for(int k=0;k<price.length;k++)
		{
			int cost=price[k]*discount[k]/100;
			dicount1[k]=cost;
			
		}
		int min=Integer.MAX_VALUE;
		int item=0;
		for(int i=0;i<dicount1.length;i++)
		{
		    if(dicount1[i]<min)
		    {
		    	min=dicount1[i];
		    	item=i;
		    }
		    
		}
		
		
		System.out.println("Items with Minimum Discoun:"+itemName[item]);
	}
	
	
	
	
	public static void main(String[]args)
	{
		System.out.println("enter number of items");
		int n=sc.nextInt();
		String[] itemName=new String[n];
		int[] price=new int[n];
		int[] discount=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the itemName");
			itemName[i]=sc.next();
			System.out.println("enter price");
			price[i]=sc.nextInt();
			System.out.println("enter discount");
			discount[i]=sc.nextInt();
			
		}
		discountOffer(itemName,price,discount);
		
		
		
	}

}
