package com.codeo.cursor;

import java.util.Iterator;
import java.util.Vector;

public class Iterators {

	public static void main(String[] args) {
		//Collection is a basket
		//1,2,3,... are objects (balls present in basket)
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		System.out.println(v);
		Iterator itr=v.iterator();

		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2!=0) {
				System.out.println(+i);
			}
			else {
				itr.remove();
			}
		
		}
		System.out.println("Fetching Elements by Backwards");
		
		

	}

}
