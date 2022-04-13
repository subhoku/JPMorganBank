package com.codeo.super1;

public class Runner {

	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.calculateArea();
	Shape circle=new Circle("circle",3.0);  //polymorphism
	circle.calculateArea();
	System.out.println(circle);
	Shape cuboid=new Cuboid("Cuboid",23,54,98.232);
	cuboid.calculateArea();
	Shape cuboid1=new Cuboid("Cuboid",32,43,76);
	cuboid1.calculateArea();
	System.out.println(cuboid.toString());

	}

}
