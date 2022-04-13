package com.codeo.accessmodifier;

public class Sample extends DefaultExample {

	public static void main(String[] args) {
		DefaultExample de=new DefaultExample();
		System.out.println(de.a);
		System.out.println(de.c);
		de.myMethod();
		ProtectedExample pe=new ProtectedExample();
		System.out.println(pe.a+" "+pe.str);
		pe.showMessage();
		

	}

}
