package com.zettamine.java.day3;

public class StudentZetta {
	static int sid=100;
	private String studentId;
	private String studentName;
	private String studentEmail;
	private String collegeName="ZETTA MINE COLLEGE";
	
	
	public StudentZetta( String studentName, String studentEmail) {
		super();
		this.studentId = generateID();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		
	}
	public String generateID()
	{
		return "ZETTA__"+(++sid);
	}
	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-25s | %-12s", studentId, studentName, studentEmail, collegeName );
	}
	
	
	
	
	

}
