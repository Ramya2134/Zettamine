package com.zettamine.java.day6.assigment1;

import java.util.ArrayList;
import java.util.List;


public class Library {
	private	List<Book> bookList = new  ArrayList<Book>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj)
	{
		bookList.add(bobj);
	}
	public 	boolean isEmpty() 
	{
		if(bookList.isEmpty())
			return false;
		return true;
	}
	public List<Book> viewAllBooks() 
	{
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author ) 
	{
		ArrayList<Book> booksByAuthor=new ArrayList<Book>();
		for(Book book : bookList)
		{
			if(book.getBookAuthor().equalsIgnoreCase(author))
			{
				booksByAuthor.add(book);
			}	
			
		}
		return booksByAuthor;
	}
	public int countNoOfBook(String bname) 
	{
		int count=0;
		for(Book book : bookList)
		{
			if(book.getBookTitle().equalsIgnoreCase(bname))
			{
				count++;
			}
		}
		return count;
	}

	

}
