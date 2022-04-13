package com.codeo.encapsulation;

public class BankAccount {
	//Data Encapsulation or Data Hiding 
	//Make variables as Private
private long accountno;
private String username;
private double amount;
public static String IFSCNo="SBIN0023234N";

//Make Setter and Getter Methods as public
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "BankAccount [accountno=" + accountno + ", username=" + username + ", amount=" + amount + ", IFSC=" + BankAccount.IFSCNo + "]";
}



}
