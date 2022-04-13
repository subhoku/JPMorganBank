package com.codeo.demo;

public class TypesOfMethods {
	
	int i=0;
	String string=null;
	public TypesOfMethods(int i, String string) {
		this.i=i;
		this.string=string;
	}
	public TypesOfMethods() {
		// TODO Auto-generated constructor stub
	}
	//It never returns
	public void add(int a,int b) {
		System.out.println("Perform Addition: "+(a+b));
	}
	//Integer type 
	public int add1() {
		return 0;
		
	}
	//boleean type
	public boolean value() {
		return false;
		
	}
	//String type
	public String normalString(String str) {
		return str;
		
	}
	//Class type method will return null
	public TypesOfMethods getMethodDetails() {
		
		return new TypesOfMethods(12,"sudarshan");
		
	}
	{
		System.out.println("hello");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfMethods tom=new TypesOfMethods();
		tom.add(3, 5);
		System.out.println(tom.add1());
		System.out.println(tom.value());
		System.out.println(tom.normalString("sudarshan"));
		System.out.println(tom.getMethodDetails());
		System.out.println(tom.getMethodDetails().i+" "+tom.getMethodDetails().string);

	}
	static {
		System.out.println("I am a static block");
	}

}
