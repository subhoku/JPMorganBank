package com.codeo.accessmodifier;
// final class cannot be extended
public class final FinalKeyword {
	
	public final void method1() {
		
	}

	public static void main(String[] args) {
		//Whenever we declare a variable as final we can't override it
	  final int a=4;
	  int b=5;
	  a=a+b;
	  System.out.println(a);
	  
	  

	}

}
