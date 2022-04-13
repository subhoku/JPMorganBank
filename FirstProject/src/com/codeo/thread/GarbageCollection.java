package com.codeo.thread;

public class GarbageCollection {
	
	

	public GarbageCollection() {
	System.out.println("Created: "+this);
		
	}

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		GarbageCollection gc=new GarbageCollection();
		System.out.println(gc);
		gc.finalize();
		
		}
		
		

	}
	protected void finalize() {
		System.out.println("Deleted: "+this);
		
	}

}
