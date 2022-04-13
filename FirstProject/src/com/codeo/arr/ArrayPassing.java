package com.codeo.arr;

import java.util.Arrays;

public class ArrayPassing {
	
	int arr[];//9,7,5,3,2,6,32,65,34,98
	
	
	public ArrayPassing(int[] arr) {
		super();
		this.arr = arr;
	}
	

	private void printArray(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public void arraySortUsingMethod() {
		
	Arrays.sort(arr);
	for(int i:arr) {
		System.out.println(i);
	}

		
		
	}
	public void addArray() {
		//9,7,5,3,2,6,32,65,34,98==>10==>0-9
		int add=0;
		int x=arr.length-1;
		System.out.println("Array Length: "+arr.length);
		for(int i=0;i<=x;i++) {
			//0=0+arr[0]==>add=9;
			//9=9+arr[1]==>add=9+7==>add=16
			//16=16+arr[2]==>add=16+5==>add=21
			add=add+arr[i];
		}
		System.out.println("Addition will be "+add);
	}
	public void countArray() {
		//9,7,5,3,2,6,32,65,34,98==>10==>0-9
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			//0=0+1==>count=1;
			//1=1+1==>count =2;
			count=count+1;
		}
		
		System.out.println("Numbers present in array will be "+count);
	}
     
	public static void main(String[] args) {
		int arr[]= {9,7,5,3,2,6,32,65,34,98,23,89};
		ArrayPassing ap=new ArrayPassing(arr);
		ap.printArray(arr);
		System.out.println("====================");
		ap.arraySortUsingMethod();
		System.out.println("====================");
		ap.addArray();
		System.out.println("====================");
		ap.countArray();
		

	}

	

}
