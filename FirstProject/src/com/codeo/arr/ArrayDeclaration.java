package com.codeo.arr;

public class ArrayDeclaration {

	ArrayDeclaration arrr[];
	public static void main(String[] args) {
		//1st way
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int[] arr3= {1,2,4,4,5};
		//2nd way 0==>2
		int[] arr2=new int[5];
		int arr1[]=new int[3];
		//arr1[1]=0
		arr1[2]=5;
		for(int x:arr1) {
			System.out.println(x);
		}

	}

}
