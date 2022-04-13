package com.codeo.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializecre {
//Deserialize the object
	//convert byte data into object
	public static void main(String[] args) {
		//creating object reference by using Gmailcredential class
GmailCredentials g=null;
try {
	//1. Using FileInputStream to get input in bytecode
	FileInputStream fis=new FileInputStream("F:\\basic html\\GmailCredentials.ser");
	//2. Using ObjectInputStream Deserialize the file content
	ObjectInputStream ois=new ObjectInputStream(fis);
	g=(GmailCredentials)ois.readObject();
	System.out.println(g);
	ois.close();
	fis.close();
	
}
catch(Exception e) {
	e.printStackTrace();
}
System.out.println("Print the Gmail Credentials after deserialization");
System.out.println("Username: "+g.username);
System.out.println("Password: "+g.password);

	}

}
