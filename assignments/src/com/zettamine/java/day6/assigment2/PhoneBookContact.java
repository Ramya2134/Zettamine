package com.zettamine.java.day6.assigment2;

import java.util.List;
import java.util.Scanner;

public class PhoneBookContact {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		PhoneBook phonebook1=new PhoneBook();
		while(true)
		{
			System.out.println("1.Add contact"
					+"2.Display ALL contact"
					+"3.search contact by phone"
					+"4.REmove contact "
					+"Exit");
			System.out.println("enter a choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the first name");
				String firstName=sc.next();
				System.out.println("enter the last name");
				String lastName=sc.next();
				System.out.println("enter the phone number");
				long phoneNumber=sc.nextLong();
				System.out.println("enter the email");
				String emailId=sc.next();
				phonebook1.addContact(new Contact(firstName,lastName,phoneNumber,emailId));
				break;
			case 2:
				List<Contact> view=phonebook1.viewAllContacts();
				for(Contact c: view)
				{
					System.out.println("firstName :"+c.getFirstName()
					+"LastName :"+c.getLastName()
					+"phone Number "+c.getPhoneNumber()
					+"Email Id " +c.getEmailId());
				}
				break;
				
			case 3:
				System.out.println("Enter the Phone number to search contact");
				long phoneNumber1=sc.nextLong();
				//List<Contact> viewDeta=(List<Contact>) phonebook1.viewContactByPhoneNo(phoneNumber1);
				Contact c1=phonebook1.viewContactByPhoneNo(phoneNumber1);
				if(c1!=null)
				{
					
				
					System.out.print("The contact is  ");
					System.out.println("firstname   "+c1.getFirstName()
					+"lastname   "+c1.getLastName()
					+"phonenumber   "+c1.getPhoneNumber()
					+"email id    "+c1.getEmailId());
				}
				else
					System.out.println("contact details doest not exit");
				break;
			case 4:
				System.out.println("Enter the Phone number to remove :");
				long removepN=sc.nextLong();
				boolean c2=phonebook1.removeContact(removepN);
				if(c2)
				{
					System.out.println("The contact is successfully deleted");
				}
				else
					System.out.println("invalid input");
				break;	
			case 5:
				System.exit(0);
			default:
					System.out.println("please enter the valid input");
				
			}
		}
		
	}

}
