package com.zettamine.java.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seralization {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many products add");
		int n=sc.nextInt();
		List<Product> list=new ArrayList<>();
		
		for(int i =1;i<=n;i++)
		{
			System.out.println("enter product id & product name of Product "+i);
			int id=sc.nextInt();
			String name=sc.next();
			list.add(new Product(id,name));
			
		}
		
		
		try {
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Ramya\\Desktop\\product\\product.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("product excution complted");
		
		
	}

	

}
