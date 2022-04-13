package com.codeo;

public class MyObject {

	int a;
	int b;
	
	public MyObject(int z) {
		System.out.println(z);
	}
	
	public MyObject(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	public void add(int a,int b) {
		System.out.println("Addition: "+(a+b));
	}

	public static void main(String[] args) {
	  MyObject myobj=new MyObject(3, 4);
	  System.out.println(myobj.a+","+myobj.b);
	  MyObject myobj1=new MyObject(5, 6);
	  System.out.println(myobj1.a+","+myobj1.b);
	  
		
        
	}

}
