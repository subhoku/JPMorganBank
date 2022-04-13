package com.codeo.arr;

public class EncapArray {
	//Encapsulation==> Data Hiding
	//variables==> declared as private
	//setter getter methods==> Declare as public
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int array[];//9,7,5,3,2,6,32,65,34,98,23,89
	//9,97,5,34,23,1,3,98,78

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	

}
