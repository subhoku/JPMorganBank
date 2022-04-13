package com.codeo.poly;

public class Rectangle extends Shape {
	
	
	
    @Override
	public void calculateArea(double length,double bredth) {
    	double area;
    	area=length*bredth;
		System.out.println("Calculate area of Rectangle: "+area);
	}
    

}
