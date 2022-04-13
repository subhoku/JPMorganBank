package com.codeo.arr;

import java.util.Arrays;

public class SortingStringArray {

	public static void main(String[] args) {
		String arr1[]= {"Tata Consultancy Services","Tech Mahindra","Codeograph solutions","Walnut folks","Codeograph solutions","Marquery"};
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				//arr1[0] compare to arr1[1];
				if(arr1[i].compareTo(arr1[j])>0) {
					String str;
					str=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=str;
					
				}
				
			}
			System.out.println("---------------");
			System.out.println(Arrays.toString(arr1));
		}

	}

}
