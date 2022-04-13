package com.codeo.accessmodifier;

public class PublicExample {
//public varibales are accessible throughout the project
	public int i=3;
	public String name="sudarshan";
	public double d=8374.34;
	//public constructor is accessible throughout the Project
public PublicExample(int j, int k) {
	System.out.println(j+" "+k);
	}
	public PublicExample() {
	// TODO Auto-generated constructor stub
}
	//public method is accessible throughout the project
	public double simpleinterst(double principal,double period,double rate) {
		double simpleinterst;
		simpleinterst=principal*period*rate/100;
		return simpleinterst;
		
	}
}
