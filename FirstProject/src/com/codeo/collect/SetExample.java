package com.codeo.collect;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		//Set is Interface
		//HashSet is class
		//Set can involve Null object
		//Set Never involved Duplicate Object
		Set<String> str=new HashSet<>();
		str.add(null);
		String s1="codeograph";
		String s2="codeo";
		String s3="graph";
		String s4="codeograph";
		
		str.add("solutions");
		str.add("building");
		str.add("infinite");
		str.add(s1);//codeograph
		str.add(s2);
		str.add(s4);//codeograph
		str.add(s3);
		
		System.out.println("String Objects"+str);
		Set<SetExample> hs=new HashSet<>();
		//In this case duplicate object will not create
		//bcoz if we write new keyword==> new obj will be created
		hs.add(new SetExample());
		hs.add(new SetExample());
		hs.add(new SetExample());
		//
		System.out.println(hs);
		
		

		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(3);
		s.add((int) 0.0);
		s.add(Integer.parseInt("23"));
		s.add(null);
		System.out.println(s);
	}

}
