package com.codeo.arr;

import java.util.Arrays;

//Add smallest and largest no.
//sorting and addition
public class AverageOfArray {
	int arr[]= {9,7,5,3,2,6,32,65,34,98,23,89};
	public void addArray() {
		//9,7,5,3,2,6,32,65,34,98==>10==>0-9
		
		int add=0;
		int avg=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			//0=0+arr[0]==>add=9;
			//9=9+arr[1]==>add=9+7==>add=16
			//16=16+arr[2]==>add=16+5==>add=21
			add=add+arr[i];
			avg=add/arr.length;
		}
		System.out.println("Addition will be "+add);
		System.out.println("Average will be: "+avg);
	}
     public void AdditionofSL() {
    	 Arrays.sort(arr);
    	 for(int i:arr) {
    		 System.out.print(+i+",");
    	 }
    	 int sum=arr[0]+arr[arr.length-1];
    	 System.out.println();
    	 System.out.println("Sum of Smallest and largest number will be: "+sum);
     }
     //Find  4th lowest number and 2nd highest
     public void findNumbers() {
    	
     }
	public static void main(String[] args) {
		//1.Declare the array
		//2.for loop addition
		//3. Find average of Array
		//9===> 18 elements(how to calculate avg)
		AverageOfArray ao=new AverageOfArray();
		ao.addArray();
		ao.AdditionofSL();
		

	}

}
