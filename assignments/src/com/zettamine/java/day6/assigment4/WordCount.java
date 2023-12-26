package com.zettamine.java.day6.assigment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args)
	{
		 
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter Student's Article:");
		        String article = scanner.nextLine();

		        // Split the article into words using special characters as delimiters
		        String[] words = article.split("[,;:.?!\\s]+");

		        // Create a HashMap to store the word counts
		        Map<String, Integer> wordCountMap = new HashMap<>();

		        // Count the occurrences of each word
		        for (String word : words) {
		            String lowercaseWord = word.toLowerCase();
		            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
		        }

		        // Sort the words alphabetically

		        List<String> sortedWords = new ArrayList<>(wordCountMap.keySet());
		        Collections.sort(sortedWords);


		        // Display the total number of words
		        System.out.println("Number of words: " + words.length);

		        // Display the words and their counts
		        System.out.println("Words with the count:");
		        for (String word : sortedWords) {
		            System.out.println(word + ": " + wordCountMap.get(word));
		        }
		    }

	}

