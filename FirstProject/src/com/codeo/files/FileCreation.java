package com.codeo.files;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		File f=new File("E:\\Sudarshan Bhople\\codeo.txt");
	
		try {
			
			f.createNewFile();
			System.out.println(f.length());
	
			
		
		String str1="codeo";
		String str2="graph8328947";
		String str3=str1+str2;
		System.out.println(str3);
		
		char arr[]=str3.toCharArray();
		//c o d e o
		FileOutputStream fos=new FileOutputStream(f);
		//Note:(f,true) old content will exist and new content will be append or concat
		for(int i=0;i<arr.length;i++) {
		
				fos.write(arr[i]);
			
		}
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}


