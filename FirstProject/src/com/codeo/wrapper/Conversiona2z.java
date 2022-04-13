package com.codeo.wrapper;

public class Conversiona2z {
	
	String str1;
	String str2;
	
	double d1;
	double d2;
	
	
	
	

	public Conversiona2z(double d1, double d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}
	public Conversiona2z(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}
	public void Boxing() {
		String d3=Double.toString(d1);
		String d4=Double.toString(d2);
		System.out.println(d3);
		System.out.println(d4);
		String add=d3+d4;
		System.out.println("Concatination of Strings will be: "+add);
		
	}
	public void Unboxing() {
		try {
		int a=Integer.valueOf(str1);
		int b=Integer.valueOf(str2);
		int c=a+b;
		System.out.println(c);
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter Integer values");
			
		}
		double c1=Double.valueOf(str1);
		double c2=Double.valueOf(str2);
		double result=c1+c2;
		System.out.println("Double result will be: "+result);
	}



	public static void main(String[] args) {
		Conversiona2z ca2z=new Conversiona2z("322", "2323");
		ca2z.Unboxing();
		Conversiona2z ca2z1=new Conversiona2z("322.23", "23.23");
		ca2z1.Unboxing();
		Conversiona2z ca2zdouble=new Conversiona2z(23.32, 60.23);
        ca2zdouble.Boxing();
	}

}
