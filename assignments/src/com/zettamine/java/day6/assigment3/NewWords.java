package com.zettamine.java.day6.assigment3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NewWords {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student's article");
		String article=sc.nextLine();
		
		
		String[] words=article.toLowerCase().split("[, ; : . ? ! ]");
		System.out.println(Arrays.toString(words));
		
		 // Create a Set to store unique words
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));

        System.out.println("Number of words: " + words.length);
        System.out.println("Number of unique words: " + uniqueWords.size());
        System.out.println("The words are");

        // Display the unique words in alphabetical order
        int count = 1;
        for (String word : uniqueWords) {
            System.out.println(count + ". " + word);
            count++;
        }
    }

		
	}


