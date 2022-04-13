package com.codeo.arr;

import java.util.Arrays;

public class Array1 {
	//Write a program to find second lowest no
	//sorting==>
	public static void main(String[] args) {
	
		int arr[]= {1,2,23,48,6,7,87,5};
		for(int p:arr) {
			System.out.println(p);
		}
		
		System.out.println("===========================");
		Arrays.sort(arr);
		//nested for loop
		for(int p:arr) {
			System.out.println(p);
		}
		//Sorting according to ASCII value...
		String arr1[]= {"TCS","CODEOGRAPH","WALNUTS","MARQUERY"};
		Arrays.sort(arr1);
		for(String p:arr1) {
			System.out.println(p);
		}	
		
		double arr3[]= {1.3,2898.097,3.2145,5,6.89,8000.887,5,4};
		System.out.println("============================");
		for(double codeo:arr3) {
			System.out.println(codeo);
		}
		

	}

}
