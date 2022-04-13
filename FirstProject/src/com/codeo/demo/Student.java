package com.codeo.demo;

import java.util.Scanner;

public class Student extends Object {
int studentrollno;
String studentname;
double studentpercent;


	public Student(int studentrollno, String studentname, double studentpercent) {
	super();
	this.studentname = studentname;
	this.studentpercent = studentpercent;
	this.studentrollno = studentrollno;
	
}
	

	@Override
	public String toString() {
		return "Student [studentrollno=" + studentrollno + ", studentname=" + studentname + ", studentpercent="
				+ studentpercent + "]";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student rollno: ");
		int studentrollno=sc.nextInt();
		System.out.println("Enter student Name: ");
		String studentname=sc.next();
		System.out.println("Enter student Percent");
		double studentpercent=sc.nextDouble();
		Student student=new Student(studentrollno,studentname,studentpercent);
		System.out.println(student);
	

	}

}
