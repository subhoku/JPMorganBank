package com.codeo.collect;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class School extends Object {
	int i;
	String string;
	double d;

	public School(int i, String string, double d) {
		this.i=i;
		this.string=string;
		this.d=d;
	}
   
	
	@Override
	public String toString() {
		return "School [i=" + i + ", string=" + string + ", d=" + d + "]";
	}


	public static void main(String[] args) {
	Set<School> hs=new HashSet<>();
	hs.add(new School(1,"sudarshan",78.56));
	hs.add(new School(3,"akshay",78.56));
	hs.add(new School(2,"rajat",78.56));
	
	
	System.out.println(hs);

	SortedSet<String> ss=new TreeSet<>();
	ss.add("galaxy");
	ss.add("codeog");
	ss.add("deActive");

	ss.add("codeog");
	System.out.println(ss);
	}

}
