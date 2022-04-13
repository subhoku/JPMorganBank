package com.codeo.arr;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		String tr="codeographsolutions";
		//sort the character in given string.(Ascending order)
		// convert String to char Array
		//c o d e o g r......
		//for loop sorting
		char arr[]=tr.toCharArray();
		 for(int i=0;i<=arr.length;i++) {
        	 for(int j=i+1;j<=arr.length-1;j++) {
        		 char str;
        		 if(arr[i]>arr[j]) {
        			 str=arr[i];
 					arr[i]=arr[j];
 					arr[j]=str;
        		 }
        	 }

	}
		 System.out.println("================");
		 System.out.println(Arrays.toString(arr));
		 
		 String sss=Arrays.toString(arr);
		 char[] c=  sss.toCharArray();
		 System.out.println(toString(c));
	 
		
	}

	private static String toString(char[] c) {
		
		  // Creating object of String class
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
 
        return sb.toString();
	}
}
