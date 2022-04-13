package com.codeo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RetrieveContents {
	
	private static String readFileAsString1(String path) {
		String getdata="";
		try {
			getdata=new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getdata;
	}

	public static void main(String[] args) {
		
       String data=null;
       data =readFileAsString1("E:\\Sudarshan Bhople\\codeo.txt");
       System.out.println(data);
	}

	

}
