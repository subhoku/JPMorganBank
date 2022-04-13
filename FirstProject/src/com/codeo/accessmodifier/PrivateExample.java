package com.codeo.accessmodifier;
//Access of Private Class won't be throughtout the project
//Private class can be accessed only throughout the pakage
public class PrivateExample {
//Private datatypes can be accessed into the class
	private int a=3;
	private String str="codeograph solutions";
	//private methods are accessible throughout the class
	private void addMethod() {
		System.out.println("https://us02web.zoom.us/j/88631291243?pwd=Nlg5SnJSd015OENlYlEybWorbVpCQT09");
	}

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		pe.addMethod();
	}
}
