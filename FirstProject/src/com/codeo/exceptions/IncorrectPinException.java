package com.codeo.exceptions;

public class IncorrectPinException extends Exception {

   public String getMessage() {
	   System.out.println("Incorrect Pin ");
	return super.getMessage();
   }
}
