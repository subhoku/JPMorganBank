package com.codeo.interface1;
//Interface doesnot have any super class
public interface Shape  {
	//Rule1.
	//Interface cannot have concrete method,
	//compile time error
	
	double pi=3.14;
	//variable compiler(by default JVM)
	//public static final double pi=3.14
	
	void findArea();//method declaration
	//public abstract void findArea();
	
	

}
