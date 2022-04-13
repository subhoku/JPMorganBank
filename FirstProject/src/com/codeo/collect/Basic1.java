package com.codeo.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Basic1  {
	
	List<String> arr;

	public Basic1() {
		
	}


	public Basic1(List<String> list) {
		arr=list;
	}
	public void basicMethod() {
		for(String s: arr) {
			System.out.println("String Object retrieved"+s);
		}
	}


	public static void main(String[] args) {
		
		List<Integer> list1=new Vector<>();
		list1.add(2);
		list1.add(4);
		list1.add(9);
		list1.add(12);
		
		
		List<String> list=new ArrayList<>(); //polymorphism
		
		list.add("codeo");
	
		list.add("sudarshan");
		list.add("graph");
		list.add(0, "Aakash");
		list.remove(3);
		list.add("Aakash");
		System.out.println(list);
		Basic1 b=new Basic1(list);
		b.basicMethod();
		
		for(String s:list) {
			System.out.println(s);
		}
		
		

	}

}
