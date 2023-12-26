package com.zettamine.java.day6.assigment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Library library=new Library();
		
		while(true)
		{
			System.out.println("1 .Add Book");
			System.out.println("2.Display all Book details");
			System.out.println("3.Search Book by Author ");
			System.out.println("4.Count Number of books - by book name");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the isbn no: ");
				long isbn=sc.nextLong();
				System.out.println();
				System.out.println("Enter the book name");
				String bookTitle=sc.next();
				System.out.println("Enter the author name: ");
				String bookAuthor=sc.next();
				library.addBook(new Book(isbn,bookTitle,bookAuthor));
				break;
			case 2:
				List<Book>  viewAllBooks=library. viewAllBooks();
				for(Book b: viewAllBooks)
				{
					System.out.println("isbnNo  "+b.getIsbnNo()
					                   + "||bookTitle  "+b.getBookTitle()
					                   +"||bookAuthor "+b.getBookAuthor());
				}
				System.out.println("");
				
				break;
			case 3:
				System.out.println("Enter the author name");
				String authorName=sc.next();
				ArrayList<Book> viewBooksByAuthor = 
						library.viewBooksByAuthor(authorName);
				if(viewBooksByAuthor.size()==0) {
					System.out.println("None of the books published by Author "+authorName);
					break;
				}
				for(Book b:viewBooksByAuthor) {
					System.out.println("ISBN no: "+b.getIsbnNo()+
							" | Book name: "+b.getBookTitle()+
							" | Author name: "+ b.getBookAuthor());
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("enter the book name");
				String bookName=sc.next();
			    int countNoOfBooks = library.countNoOfBook(bookName);
				System.out.println("The count of book "+bookName+" = "+countNoOfBooks);
				System.out.println();
				break;
			case 5:
				System.out.println(" Successfully Completed ----Bye Bye");
				System.exit(0);
			default:
					System.out.println("please enter a valid input");
				
			}
			
		}
		
	}


}
