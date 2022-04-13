package com.codeo.arr;
//Find the Duplicate Elements in array

public class DuplicateElements {

	public static void main(String[] args) {
		
		   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8,4, 3};   
		 System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i <= arr.length; i++) {  
	            for(int j = i + 1; j <= arr.length-1; j++) {  
	                if(arr[i] == arr[j]) { 
	                    System.out.println("Duplicate elements are present at: "+i+" position");
	                    
	                }
		 
	}
		 
}
}}