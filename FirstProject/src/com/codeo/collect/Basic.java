package com.codeo.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {
	int rollno;
	String name;
	double percent;
	
	public Basic(int rollno, String name, double percent) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percent = percent;
	}

	public static void main(String args[]) {
		List<Basic> arr=new ArrayList<>();
		arr.add(new Basic(11,"sudarshan",67));
		arr.add(new Basic(11,"sudarshan",68));
		arr.add(new Basic(11,"sudarshan",69));
		arr.add(new Basic(11,"sudarshan",79));
		
		for(Basic b:arr) {
			System.out.println(b);
			System.out.println(" "+b.name+" "+b.percent);
		}
	}
}