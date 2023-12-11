package com.zettamine.java.day2;

import java.util.Scanner;

public class TicketPriceCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings: ");
		int booking=sc.nextInt();
		System.out.println("Enter the available tickets");
		int availableTickets=sc.nextInt();
		System.out.println();
		
		TicketPrice.setAvailableTickets(availableTickets);
		
		int totalAmount=0;
		for(int i=1;i<=booking;i++)
		{
			
			System.out.println("enter the ticketId :");
			int ticketid=sc.nextInt();
			
			System.out.println("enter the price:");
			int price=sc.nextInt();
			
			System.out.println("enter the no of tickets");
			int nooftickets=sc.nextInt();
			
			
		   TicketPrice ticket=new TicketPrice();
		   ticket.setTicketid(ticketid);
		   ticket.setPrice(price);
		   
		   int amount=ticket.calculateTicketCost(nooftickets);
		   
		   
		   if(amount == -1)
		   {
			   System.out.println("Tickets are  not available for booking");
			   
		   }
		   else
		   {
			   System.out.println("Available tickets: "+availableTickets);
			  // System.out.println("Available tickets: "+TicketPrice.getAvailableTickets());
			   System.out.println("Total amount: "+amount);
			   System.out.println("Available ticket after booking: "+TicketPrice.getAvailableTickets());
			   totalAmount+=amount;
			   availableTickets=TicketPrice.getAvailableTickets();
		   }
		   
			
			
		}
		System.out.println("total amount for all booking :"+totalAmount);
		sc.close();
		
	}

}
