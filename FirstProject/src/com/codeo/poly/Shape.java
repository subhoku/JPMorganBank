package com.codeo.poly;

public class Shape {
	
	
	public void calculateArea(double length,double bredth) {
		System.out.println("Calculate area of particular Shape");
	}
	//Overloading
	public void calculateArea(double length) {
		System.out.println("Calculate area of square and circle");
	}
	public void msg() {
		System.out.println("Shape msg");
	}
	 public int variables(int a, String b) {
		 
		return a;
		 
	 }
	 public int variables(String b,int a) {
		return a;
		 
	 }

}
