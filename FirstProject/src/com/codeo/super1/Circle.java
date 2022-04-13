package com.codeo.super1;

public class Circle extends Shape {

	public Circle(String shapename, double length) {
		super(shapename, length);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateArea() {
		double area;
		area=3.14*length*length;
		System.out.println("Area of "+shapename+" will be "+area);
	}
	


}
