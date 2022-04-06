package com.codeo.mavendatabaseconn.JunitProject;



public class ArithmeticOperation {
	int c;
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int add(int a, int b) {
		c=a+b;
		this.c=c;
		return c;
	}
	
	/*
	 * public boolean examine(int a) {
	 * 
	 * if(a%2==0) { return true; }
	 * 
	 * return false;
	 * 
	 * }
	 */
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public double calculateSimpleInterst(double Principal,double rate, double period) {
		return Principal*rate*period/100;
		
	}
	
	public String nameConcatination(String one,String two) {
		
		return one+two;
		
	}
	 public boolean isEvenNumber(int number){
         
	        boolean result = false;
	        if(number%2 == 0){
	            result = true;
	        }
	        return result;
	    }
}
