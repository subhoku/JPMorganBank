package com.codeo.arr;

public class SortingofArrays {

	public static void main(String[] args) {
		//arr[0]=9,arr[1]=97,arr[2]=5....arr[8]=78
		int arr[]= {9,97,0,5,34,23,1,3,98,78};
		//before sorting parameters printing
		//Logical sorting
		//1. Compare the 2 elements(if a<=b)
		//2. if condition matches then swap the number
		//3. Iteration 
		//after sorting parameters printing
		System.out.println("Print the array before sorting: ");
         for(int i:arr) {
        	 System.out.print(+i+",");
         }
         //Sorting Process
         
         //Comparison between 2 elements
         //ArrayLength will be 9 so==> 0==>8
         //arr[0]>arr[1]==> Swap the elements
         for(int i=0;i<=arr.length;i++) {
        	 for(int j=i+1;j<=arr.length-1;j++) {
        		 //arr[0]>arr[1]
        		 if((arr[j]) !=0) {
        		 if(arr[i]>arr[j]) {
        			 //start swapping(arr[i]=97,arr[j]=5
        			arr[i]=arr[i]+arr[j];//97+5=>102
        			arr[j]=arr[i]-arr[j];//102-5==>arr[j]=97
        			arr[i]=arr[i]-arr[j];//102-97==>arr[i]=5
        			 
        		 }}
        		 else {
        			 System.out.println("Remove zero");
        		 }
        	 }
         }
         System.out.println();
         System.out.println("===========================");
         System.out.println("The sorted Arrays will be: ");
         for(int i:arr) {
        	 System.out.print(+i+",");
         }
	}

}
