package com.codeo.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exception1 {
String name;
int pinno;
double amount;
double bankBalance;
double cashremaining;

public Exception1(String name,int pinno,double bankBalance) {
	super();
	this.pinno = pinno;
	this.bankBalance = bankBalance;
	this.name=name;
}
public Exception1() {
	// TODO Auto-generated constructor stub
}
int day,month,year,hour, minute,second;
static {
	System.out.println("Welcome to SBI ATM");
	System.out.println("==================");
}
	public void loginToATM() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Pin no: ");
		int localpinno=sc.nextInt();
		try {
			if(pinno==localpinno) {
				System.out.println("Entered Pin no matches");
				System.out.println("Welcome "+name+" to your account: ");
			}
			else {
				
				throw new IncorrectPinException();
			}
			System.out.println("Enter your amount: ");
			amount=sc.nextDouble();
			if(amount<=bankBalance) {
				cashremaining=bankBalance-amount;
				System.out.println("The Cash remaining will be: "+cashremaining);
				System.out.println("Your Transaction has been proceeded please collect the cash");
				
			}
			else {
				System.out.println("You are facing issue of insufficient balance");
				throw new InsufficientBalance();
			}
			
			
			
		}
		catch(IncorrectPinException x) {
			x.printStackTrace();
		}
		catch(InsufficientBalance e) {
			e.printStackTrace();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thanks for using SBI ATM");
		}
		Calendar c=new GregorianCalendar();
		day=c.get(Calendar.DAY_OF_MONTH);
		month=c.get(Calendar.MONTH);
		year=c.get(Calendar.YEAR);
		hour=c.get(Calendar.HOUR_OF_DAY);
		minute=c.get(Calendar.MINUTE);
		second=c.get(Calendar.SECOND);
		System.out.println("Date: "+day+"-"+month+"-"+year);
		System.out.println("Time: "+hour+":"+minute+":"+second);
		
	
		
	}
	public static void main(String[] args) {
		Exception1 exception=new Exception1(); //object creation
		//exception.loginToATM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name");
		String name=sc.next();
		Exception1 account1=new Exception1("sudarshan",1239,10000);
		if(name.equals("sudarshan")) {
			account1.loginToATM();
		}
		
		
		else if(name.equals("Aakash")){
			Exception1 account2=new Exception1("Aakash",7598,15999);
		account2.loginToATM();
		}
		else {
			System.out.println("incorrect input");
		}

	}

	

}
