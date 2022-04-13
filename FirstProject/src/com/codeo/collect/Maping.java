package com.codeo.collect;

import java.util.HashMap;
import java.util.Map;

public class Maping {

	public static void main(String[] args) {
		//Map,SortedMap==> Interface
		//HashMap,TreeMap==>Class
		//Telephone Directory
		//key==> Aadharcard,Pancard,Mobileno,unique  id
		//Values==> may or may not be duplicate
		Map<Integer,String> m1=new HashMap<>();
		//m1.put(key,value)
		m1.put(97688545, " Xyz Joshi");
		m1.put(97688546, " Xyz Joshi");
		m1.put(3, "Walnut");
		m1.put(4, "sid");
		m1.put(9, "Folks");
		m1.put(5, "Marquery");
		m1.put(6, "solution");
		m1.put(7, "remappingFunction");
		
		System.out.println(m1);
		 for (Map.Entry<Integer,String> entry : m1.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
		System.out.println("=================================");
		System.out.println("==================================");
		
		 
		 Map<Integer,String> m2=new HashMap<>();
			//m1.put(key,value)
			m2.put(1, "codeograph");
			m2.put(2, "solutions");
		
			m2.put(3, "Folks");
			m2.put(4, "Walnut");
			m2.put(5, "Marquery");
			m2.put(6, "solutions");
			
			m2.putAll(m1);
			 for (Map.Entry<Integer,String> entry : m2.entrySet())
		            System.out.println("Key = " + entry.getKey() +
		                             ", Value = " + entry.getValue());

	}

}
