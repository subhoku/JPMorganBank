package com.codeo.collect;

import java.util.HashSet;
import java.util.Set;

public class School {

	public School(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Set<School> hs=new HashSet<>();
	hs.add(new School(1,"sudarshan",78.56));
	hs.add(new School(1,"sudarshan",78.56));
	hs.add(new School(3,"sudarshan",78.56));
	
	System.out.println(hs);

	}

}
