package com.codeo.super1;

public class Cuboid extends Shape {
	
	double bredth;//54
	double height;//98.232
	int a=3;
	
//shapename=Cuboid , length=23,bredth=54,height=98.232
	public Cuboid(String shapename, double length,double bredth,double height) {
		super(shapename, length);
		this.height=height;
		this.bredth=bredth;
		
	
			
		// TODO Auto-generated constructor stub
	}
//2 [( l × b ) + ( l× h ) + ( b× h )]
	
	public void calculateArea() {
		System.out.println("Value of a: "+a);
		System.out.println("Value of a: "+super.a);
		System.out.println("Square of 6 will be: "+(super.a*super.a));
		System.out.println(length+" "+shapename);
		double area;
		area=2*((length*bredth)+(length*height)+(bredth*height));
		System.out.println("Area of "+shapename+" will be: "+area);
		System.out.println("===============================");
		super.shapeIdentity();
	}
}
