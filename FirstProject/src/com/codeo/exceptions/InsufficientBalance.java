package com.codeo.exceptions;

public class InsufficientBalance extends Exception {

	 public String getMessage() {
		   System.out.println("Insufficient Balance");
		return super.getMessage();
	   }
}
