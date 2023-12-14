package com.zettamine.java.day4;

import java.util.Scanner;

public class YesBank {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the Account number");
		int accountNumber=sc.nextInt();
		System.out.println("enter the customer Id");
		int customerId=sc.nextInt();
		System.out.println("enter the customer name");
		String customerName=sc.next();
		System.out.println("enter the customer Email");
		String emailId=sc.next();
		System.out.println("enter the balance");
		double balance=sc.nextDouble();
		System.out.println("enter minium balance");
		int minimumBalance=sc.nextInt();
		
		Customer customer=new Customer(customerId,customerName,emailId);
		
		Account account=new SavingsAccount(accountNumber,customer,balance,minimumBalance);
		
		System.out.println("enter amount to withdraw: ");
		double amountToWithdraw=sc.nextDouble();
		System.out.println("~".repeat(50));
		System.out.println("~".repeat(50));
		
		
	    boolean isWithdrawSuccessful=account.withdraw(amountToWithdraw);
	    
	    if(isWithdrawSuccessful)
	    {
	    	System.out.printf("Rs.%.2f debited | Balance: %.2f",amountToWithdraw,account.getBalance());
	    }
	    else
	    {
	    	System.out.println("Withdraw is failed . Insufficient balance :");
	    }
		
		
		
		
		
		
		
	}
	

}
