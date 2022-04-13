package com.codeo.stringcon;

public class Blocks extends Object {
	
	//high priority
	static {
		System.out.println("Welcome to codeograph");
	}
	static {
		System.out.println("I am the first static block");
	}
	{
		System.out.println("I am nonstatic block");
	}

	public static void main(String[] args) {
		System.out.println("helo world");
	Blocks b=new Blocks();
	Blocks b1=new Blocks();

	}

}
