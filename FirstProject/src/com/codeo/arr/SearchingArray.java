package com.codeo.arr;

import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		int arr[]= {9,97,5,34,23,1,3,98,78};
		//insert array
		//Scanner class which number to search
		//Number found in array
		//element not found
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be searched: ");
        int element=sc.nextInt();
        int temp=0;
        for(int i=0;i<arr.length;i++) {
        	//9==34 false
        	//94==34 false
        	//34==34 true
        	if(arr[i]==element) {
        		System.out.println("Element found at "+i+" position");
        		//0=0+1==>temp=1
        		temp=temp+1;
        	}
        }
        //1==0==> false
        if(temp==0) {
        	System.out.println("Element not found");
        }
	}

}
