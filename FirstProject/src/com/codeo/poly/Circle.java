package com.codeo.poly;

public class Circle extends Shape {
	
	double radius;
	
	
	
	

	public void calculateArea(double radius) {
		double area;
		area=3.14*radius*radius;
		System.out.println("Calculate area of circle: "+area);
	}

}
