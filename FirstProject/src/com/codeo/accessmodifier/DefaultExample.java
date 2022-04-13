package com.codeo.accessmodifier;
//you can extend default class
//default class can be accessed throughout the pakage
class DefaultExample {
	//default constructor is accessible throughtout pakage
	int a=3;
	String c="codeo";
	double z=92832.323;
//Default variable can be accessed throughout the pakage
	//default method can be accessed throughout the pakage
	void myMethod() {
		System.out.println("I am the default Method");
	}
	
	
	
	/*
	 * public static void main(String[] args) { DefaultExample de=new
	 * DefaultExample(); System.out.println(de.a+" "+de.c+" "+de.z); DefaultExample
	 * de1=new DefaultExample();
	 * 
	 * 
	 * }
	 */

}
