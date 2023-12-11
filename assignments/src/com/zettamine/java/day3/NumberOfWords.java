package com.zettamine.java.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfWords {
	public static void main(String[]args)
	{
		System.out.println("hii");
		String  s="Heloo everyone welcome to collection in java,collection is  like a container and powerful cocepts in java";
		String[] word=s.split(" ");
		int wordLength=word.length;
		System.out.println("number of words :"+wordLength);
		
		
		Set<String> uniqueWords=new HashSet<>(Arrays.asList(word));
		/*for(int i=0;i<word.length;i++)
		{
			uniqueWords.add(word[i]);
			
		}
		*/
		System.out.println(uniqueWords.size());
	}

}
