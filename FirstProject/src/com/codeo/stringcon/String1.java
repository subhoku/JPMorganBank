package com.codeo.stringcon;



public class String1 {

	public static void main(String[] args) {
	
		String str="codeograph solutions";
		String str1="IT";
	System.out.println(str.length());
	System.out.println(str.concat(" "+str1));
	System.out.println(str.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str.charAt(4));
	System.out.println(str.indexOf('c'));
	System.out.println(str.contains("codeo"));
	System.out.println(str.equals(str1));
	System.out.println(str.trim());
    System.out.println(str.replace('o', 'c'));
    System.out.println(str.replaceAll(str, str1));
   System.out.println(str.substring(3, 9));
   System.out.println(str.substring(4));
  
	}

}
