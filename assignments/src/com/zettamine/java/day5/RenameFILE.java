package com.zettamine.java.day5;

import java.io.File;

public class RenameFILE {
	public static void main(String[] args)
	{
		File subDi=new File("D:\\CJava","Java");
	 File rename=new File("D:\\CJava\\fullstack.txt");
		//subDi.renameTo("j.txt");
		
		if(subDi.exists())
		{
			subDi.renameTo(rename);
		}else
		{
			System.out.println("file is not found");
		}
	    		
		
		
	}

}
