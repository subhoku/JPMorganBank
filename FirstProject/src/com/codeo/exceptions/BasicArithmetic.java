package com.codeo.exceptions;

import java.util.Scanner;

public class BasicArithmetic {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no's :  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Answer of division will be: "+c);
		}
		catch(Exception e) {
			System.out.println("Enter proper input");
		}
	}

}
