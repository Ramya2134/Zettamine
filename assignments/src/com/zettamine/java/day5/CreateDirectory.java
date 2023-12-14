package com.zettamine.java.day5;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {
	public static void main(String[]args) throws IOException
	{
		File subDir=new File("D:\\CJava","Java");
		subDir.mkdirs();
		File file=new File(subDir,"java.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
	}

}
