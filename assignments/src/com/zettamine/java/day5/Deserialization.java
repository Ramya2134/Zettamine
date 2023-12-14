package com.zettamine.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {
	public static void main(String[] args)
	{
		try {
		FileInputStream fis=fis=new FileInputStream("C:\\Users\\Ramya\\Desktop\\product\\product.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		List<Product> list1=( ArrayList<Product>) ois.readObject();
		
		System.out.println(list1);
		System.out.println("Deserialization is complted");
		}
		 catch(FileNotFoundException e)
		{
		 e.printStackTrace();
		}
		catch(IOException t3)
		{
			t3.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
