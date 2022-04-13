package com.codeo.poly;

public class Cylinder extends Shape{

	
	@Override
	public void calculateArea(double radius,double height) {
		double area;
		area=3.14*radius*radius*height;
		System.out.println("Calculate area of Cylinder: "+area);
	}

}
