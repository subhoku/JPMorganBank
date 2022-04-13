package com.codeo.poly;

public class Runner {

	public static void main(String[] args) {
		Shape shape=new Shape();// Inheritance
		shape.calculateArea(23);
		shape.calculateArea(23, 84);
		Shape rectangle=new Rectangle();// Polymorphism
		rectangle.calculateArea(34, 54);
		rectangle.msg();
		Shape circle=new Circle();
		circle.calculateArea(12);
		Shape cylinder=new Cylinder();
		cylinder.calculateArea(23, 34);

	}

}
