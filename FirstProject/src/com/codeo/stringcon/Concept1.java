package com.codeo.stringcon;

public class Concept1 {

	public static void main(String[] args) {
		
		String str="codeo";
		String str1="codeo";
		
		String no="23";
		int n=23;
		int sum;
		sum=n+Integer.parseInt(no);
		String concat=str1+String.valueOf(n);
		System.out.println(concat);
		System.out.println(sum);
		//content comparison	
				if(str.equals(str1)) {
					System.out.println("as content is same new obj is not created ");
				}
				else {
					System.out.println("Different String content objects will not be same");
				}	
	//object comparison	
		if(str==no) {
			System.out.println("as content is same new obj is not created ");
		}
		else {
			System.out.println("Different String content objects will not be same");
		}
		
		String z=new String("hello");
		System.out.println(z);
		String y=new String("xyz");
		System.out.println(y);
      //Object Test: are these object equals or not
		if(z==y) {
			System.out.println("same object is created");
		}
		else {
			System.out.println("Different Object is created");
		}
		//Content Test
		if(z.equals(y)) {
			System.out.println("Content is equal");
		}
		else {
			System.out.println("Content is different");
		}
	}

}
