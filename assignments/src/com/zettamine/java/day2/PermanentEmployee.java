package com.zettamine.java.day2;

public class PermanentEmployee  extends Employee{

	private  double basicPay;

	public PermanentEmployee(int employeeId, String employeeName,double basicpay) {
		super(employeeId, employeeName);
		
		this.basicPay=basicpay;
		
		
		
	}
	public void calculateSalary()
	{
		double pFAmount = getBasicPay()*0.12;
		salary = getBasicPay()-pFAmount;
		setSalary(salary);
	}
	

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	
}
