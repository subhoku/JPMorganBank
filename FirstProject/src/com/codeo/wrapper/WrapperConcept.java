package com.codeo.wrapper;

public class WrapperConcept {

	public static void main(String[] args) {
	String str="3";
	String str1="3";
	//Wrapper class
	//UnBoxing:-Retrieving the information from an object into variable.
	
	int a=Integer.valueOf(str1);
	int b=Integer.valueOf(str);
	int c=a+b;
	System.out.println(c);
	
	double c1=Double.valueOf(str1);
	double c2=Double.valueOf(str);
	double result=c1+c2;
	System.out.println("Double result will be: "+result);
	
	
	//Boxing:-Wrapping a primary data type variable in form of an object.
	
	double e=25.659;
	double f=534.323;
	
	
	String d1=Double.toString(e);
	String d2=Double.toString(f);
	System.out.println(d1);
	System.out.println(d2);
	String add=d1+d2;
	System.out.println(add);
	
	
	
	}

}
