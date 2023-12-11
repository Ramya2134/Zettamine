package com.zettamine.java.day1;

import java.util.Scanner;

public class MovieTicketCalculation {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of tickets: ");
        int numOfTickets = scanner.nextInt();

        if (numOfTickets < 5 || numOfTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshment? (Y/N): ");
        String refreshmentChoice = scanner.next();
        double refreshmentCost = 0.0;
        if (refreshmentChoice.equalsIgnoreCase("Y"))
        {
            refreshmentCost = 50.0 * numOfTickets;
        }

        System.out.print("Do you have a coupon code? (Y/N): ");
        String couponChoice = scanner.next();
        double couponDiscount = 0.0;
        if (couponChoice.equalsIgnoreCase("Y")) 
        {
            couponDiscount = 0.02;
        }
        System.out.print("Enter the circle (K/Q): ");
        String circle = scanner.next();
        double ticketCost;
        if (circle.equalsIgnoreCase("K")) {
            ticketCost = 75.0;
        } 
        else if (circle.equalsIgnoreCase("Q")) {
            ticketCost = 150.0;
        }
        else 
        {
            System.out.println("Invalid Input");
            return;
        }

        double totalCost = numOfTickets * ticketCost;
        totalCost += refreshmentCost;
       totalCost -= totalCost * couponDiscount;
       // totalCost=(couponDiscount/totalCost)*100;

        System.out.printf("Ticket cost: %.2f", totalCost);
    }



	}


