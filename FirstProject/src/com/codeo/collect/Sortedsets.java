package com.codeo.collect;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsets {

	public static void main(String[] args) {
		//Interface==> SortedSet
		//Class==> TreeSet
		SortedSet<String> ss=new TreeSet<>();
		ss.add("zukerberg");
	
		ss.add("Matt");
		ss.add("Junior David");
		ss.add("Taylor");
		ss.add("Jhonson");
		ss.add("Matt");
		ss.add("Junior David");
		SortedSet<String> si=new TreeSet<>();
		si.add(Integer.toString(1));
		si.add(Integer.toString(2));
		si.add(Integer.toString(1));
		SortedSet<String> ss1=new TreeSet<>();
		ss1.add("sudarshan");
		ss1.add("Matt");
		ss1.add("Junior David");
		ss1.add("Lenin");
		ss1.add("Jhonson");
		ss1.add("matt");
		ss1.add("Junior Edison");
		System.out.println(ss);
		ss.addAll(si);
		System.out.println(ss);
		//Duplicates are not allowed
		//Objects are sorted according to ascending order
       ss.removeAll(ss);
       System.out.println(ss);
       ss.addAll(ss1);
       System.out.println(ss);
       System.out.println(ss1);
	}

}
