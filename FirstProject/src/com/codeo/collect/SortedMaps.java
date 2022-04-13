package com.codeo.collect;


import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		//SortedMap is an Interface
		//TreeMap is a class
		SortedMap<Integer,String> m1=new TreeMap<>();
 //Sorting is done by using Key
		m1.put(1, "codeograph");
		m1.put(2, "solutions");
		m1.put(9, "Folks");
		m1.put(5, "Marquery");
		m1.put(6, "solution");
		m1.put(7, "mappingFunction");
		m1.put(3, "Walnut");
		m1.put(4, "sid");
		System.out.println(m1);
		
		SortedMap<String, String> m2=new TreeMap<>();
		 //Sorting is done by using Key
				m2.put("first", "codeograph");
				m2.put("second", "solutions");
				m2.put("third", "Folks");
				m2.put("seventh", "Marquery");
				m2.put("five", "solution");
				m2.put("eleven", "mappingFunction");
				
				System.out.println(m2);
		
	}

}
