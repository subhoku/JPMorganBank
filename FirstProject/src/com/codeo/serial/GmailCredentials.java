package com.codeo.serial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GmailCredentials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2632216321148490578L;
	public String username;
	public String password;
	
	
	public GmailCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public static void main(String[] args) {
		
		GmailCredentials gc=new GmailCredentials("sudarshan@gmail.com", "xyz");
		//1. Create a serializable file
		File f=new File("F:\\basic html\\GmailCredentials.ser");
		try {
			f.createNewFile();
			//2.Create FileOutputStream(converts into byte code)
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(gc);
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
