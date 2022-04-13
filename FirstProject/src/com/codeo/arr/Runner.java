package com.codeo.arr;

public class Runner {

	public static void main(String[] args) {
		int arr[]= {9,7,5,3,2,6,32,65,34,98,23,89};
		EncapArray earray=new EncapArray();
		earray.setArray(arr);
		earray.setName("sudarshan");
		for(int arr1: earray.getArray()) {
			System.out.println(arr1);
		}
		System.out.println(earray.getName());

	}

}
