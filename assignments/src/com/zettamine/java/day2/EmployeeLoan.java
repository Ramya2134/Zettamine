package com.zettamine.java.day2;

public class EmployeeLoan {
	public static void main(String[] args)
	{
		Employee e1=new PermanentEmployee (123,"ragava",5678.00);
		Employee e2=new TemporaryEmployee(543,"chary",10,10);
		((TemporaryEmployee)e2).setHourlyWages(10);
		
		Loan loan=new Loan();
		
		double loanPE=loan.calculateLoanAmount(e1);
		double loanTE=loan.calculateLoanAmount(e2);//10
		System.out.println("perament employee loan :"+loanPE);
		System.out.println("tempary employee loan  :"+loanTE);
		
	}

}
