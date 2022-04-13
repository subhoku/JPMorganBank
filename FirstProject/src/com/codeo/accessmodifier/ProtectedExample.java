package com.codeo.accessmodifier;

public class ProtectedExample {
	//Protected varibles are accessible throughout the class
	//Protected variables are accessible throughout the pakage
	//protected variables can't be accessed throughout the Project
	protected int a=3;
	protected String str="codeo";
	
	//protected methods are accessible throughout the pakage
	//but not accessible throughout the project
	protected void showMessage() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		ProtectedExample pe=new ProtectedExample();
		System.out.println(pe.a+ " "+ pe.str);

	}

}
