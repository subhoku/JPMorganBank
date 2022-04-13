package com.codeo.cursor;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {
//List Iterator ==> Interface Derieved by Iterator
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("codeo");
		list.add("graph");
		list.add("solutions");
		list.add("building");
		list.add("infinite");
		list.add("relationship");
		System.out.println(list);
		
		ListIterator<String> lir=list.listIterator();
		try {
		while(lir.hasNext()) {
			
			String s=(String)lir.next();
			if(s.equals("solutions")) {
				lir.remove();
				}
			else if(s.equals("infinite")|| s.equals("relationship")) {
				lir.add("infinity");
			}
			else if(s.equals("graph")) {
				lir.set("graphy");
			}
			 
		}
		
		
  System.out.println(list);
  System.out.println("In the backward direction:- ");  
  while (lir.hasPrevious()) {  
      System.out.println(lir.previous());  
  }  
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
