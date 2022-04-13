package com.codeo.super1;

public class Shape {

	int a=6;//0
String shapename;
double length;
//shapename="cuboid", length=23;
public Shape(String shapename, double length) {
	super();
	this.shapename = shapename;
	this.length = length;
}
public Shape() {
	// TODO Auto-generated constructor stub
}
public void shapeIdentity() {
	System.out.println("Identity of Particular shape");
}
@Override
public String toString() {
	return "Shape [shapename=" + shapename + ", length=" + length + "]";
}
public void calculateArea() {
	System.out.println("value of variable"+a);
	
}



}
