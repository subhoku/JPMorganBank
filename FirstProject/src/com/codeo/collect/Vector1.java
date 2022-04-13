package com.codeo.collect;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	
		List<Integer> v=new Vector<>();
		v.add(1);
		v.add(3);
		v.add(1);
		
		System.out.println(v);
		Vector<Integer> v1=new Vector<>();
		for(int i=1;i<=10;i++) {
			v1.addElement(new Integer(i*10));
			
		}
		System.out.println(v1);
		v1.removeElementAt(3);
		System.out.println(v1);
		v1.removeElementAt(6);
		v1.add(3, 45);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());

	}

}
