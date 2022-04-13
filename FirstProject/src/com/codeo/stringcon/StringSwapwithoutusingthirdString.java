package com.codeo.stringcon;

import com.codeo.accessmodifier.PublicExample;

public class StringSwapwithoutusingthirdString {

	public static void main(String[] args) {
		String str="codeo";
		String str1="graph";
	//Swapping 2 String without using 3rd String
		//1. Declare string before swapping
		//2. Swapping logic without using 3rd variable
		//3. Print final result after swapping
		System.out.println("The before swapping value of String 1: "+str);
		System.out.println("The before swapping value of String 2: "+str1);
		//swapping logic
		str=str+str1;//str==>codeo+graph==>codeograph ==>10 length==>0-9
		//graph=(codeo)==> str1=codeo
		str1=str.substring(0, str.length()-str1.length());//(0,5)
		//codeograph==>5  str==>graph
		str=str.substring(str1.length());
		System.out.println("================================");
		System.out.println("String 1 after swapping: "+str);
		System.out.println("String 2 after swapping: "+str1);
		PublicExample pe=new PublicExample();
		System.out.println(pe.d);
	

	}

}
