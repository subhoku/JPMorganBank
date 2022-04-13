package com.codeo.arr;

public class ArrayObj {
	ArrayObj aobjmain[];
	ArrayObj aobjmain1[];
	

	public ArrayObj(ArrayObj[] aobj,ArrayObj[] aobj1) {
		super();
		this.aobjmain = aobj;
		this.aobjmain1=aobj1;
	}


	public ArrayObj() {
		// TODO Auto-generated constructor stub
	}


	public ArrayObj(ArrayObj aobj, ArrayObj aobj1) {
		
	}


	public static void main(String[] args) {
		ArrayObj aobj=new ArrayObj();
		ArrayObj aobj1=new ArrayObj();
		ArrayObj aobj2=new ArrayObj(aobj,aobj1);
		
		
		

	}

}
