package com.codeo.demo;


import com.codeo.accessmodifier.ProtectedExample;
import com.codeo.accessmodifier.PublicExample;

class MyClass extends ProtectedExample  {

	public static void main(String[] args) {
		PublicExample pe=new PublicExample(23,43);
		System.out.println(pe.d+" "+pe.i+ " "+ pe.name);
		System.out.println("The simple interst will be: "+pe.simpleinterst(23400,3,12.34));
ProtectedExample p2e=new ProtectedExample();	


}
}