package com.codeo.arr;

import java.util.Scanner;

public class ArraysByUser {

	public static void main(String[] args) {
	//how to take array values from user
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers you want to store");
		int a=sc.nextInt();
		
		//
		System.out.println("Maximum capacity of an array");
		int capacity=sc.nextInt();
		//5==>0-5
		int arr[]=new int[capacity];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements stored in array will be: ");
         //nested for loop
		for(int j:arr) {
			System.out.println(j);
		}
	}

}
