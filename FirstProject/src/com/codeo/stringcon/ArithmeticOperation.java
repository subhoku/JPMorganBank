package com.codeo.stringcon;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no's :  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Answer of division will be: "+c);
		 int arr[]= {3,5,6,7,7,9};
	     System.out.println(arr[9]);
	}
	
	catch(ArithmeticException e) {
		System.out.println("Arithmatic Exception");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndex out of bound exception");
	}
	catch(Exception e) {
		System.out.println("Please enter proper input");
	
	}
	finally {
		System.out.println("Thanks for using calc");
	}
		

	}

}
