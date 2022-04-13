package com.codeo.inheritance;

import java.util.Scanner;

public class Yatracom extends Indigo {

	public void TicketsByYatracom(double flightprice) {
		double finalprice;
		finalprice=flightprice-(5*flightprice/100);
		System.out.println("Ticket rate by Yatra.com will be: "+finalprice);
	}
	public void evenOddMethod() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2!=0) {
			System.out.println();
		}
		int arr[]= {1,2,3,4,5,6,6};
		for(int i:arr) {
			System.out.println(i);
		}
		
		
	}
}
