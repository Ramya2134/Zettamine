package com.zettamine.java.day2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) 
	{  double loan;
		if(employeeObj instanceof PermanentEmployee)
		{
			employeeObj.calculateSalary();
			loan = employeeObj.getSalary()*0.15;
			return loan;
		}
		else
		{
			employeeObj.calculateSalary();
			loan = employeeObj.getSalary()*0.1;
			return loan;
		}
		
		
	}
}
