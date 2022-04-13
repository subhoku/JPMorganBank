package com.codeo;

import com.codeo.arr.EncapArray;

public class ArrayTesting {

	public static void main(String[] args) {
	EncapArray ea=new EncapArray();
	int arr[]= {9,97,5,34,23,1,3,98,78};
	ea.setArray(arr);
	for(int arr1: ea.getArray()) {
		System.out.println(arr1);
	}

	}

}
