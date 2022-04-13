package com.codeo.encapsulation;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Account Holder Name");
	String name=scanner.next();
	System.out.println("Enter Account Number: ");
	long accountno=scanner.nextLong();
	System.out.println("Enter the Amount");
	double amount=scanner.nextDouble();
	BankAccount ba=new BankAccount();
	ba.setAccountno(accountno);
	ba.setUsername(name);
	ba.setAmount(amount);
	
	System.out.println(ba);
	

	}

}
