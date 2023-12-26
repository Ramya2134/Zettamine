package com.zettamine.java.day6.assigment2;

import java.util.ArrayList;
import java.util.List;



public class PhoneBook {
	 private List<Contact> phoneBook = new ArrayList<Contact>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	public void addContact(Contact contactObj)
	{
		phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts() 
	{
		return phoneBook;
	}
	public Contact viewContactByPhoneNo(long phoneNumber)
	{
		for(Contact contact :phoneBook)
		{
			if(contact.getPhoneNumber()==phoneNumber)
				return contact;
		}
		return null;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		for(Contact con:phoneBook)
		{
			if(con.getPhoneNumber()==phoneNumber)
			{
				phoneBook.remove(con);
				return true;
			}
		}
		return false;
	}
	


	 
	 


}
