package com.zettamine.java.day2;
//Student Details - Constructor
public class StudentDetails {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String  collegeName;
	
	//student from NIT college
	public StudentDetails(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName="NIT";
	}
	
	
	
	//student from other colleges
	public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}



	public  int getStudentId() {
		return studentId;
	}






	public String getStudentName() {
		return studentName;
	}






	public String getStudentAddress() {
		return studentAddress;
	}



	



	public String getCollegeName() {
		return collegeName;
	}



	
	
	

}
