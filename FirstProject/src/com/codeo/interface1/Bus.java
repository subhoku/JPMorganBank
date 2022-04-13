package com.codeo.interface1;

public class Bus implements Vehicle {

	@Override
	public void engine() {
		System.out.println("Engine with 2000cc");
		
	}

	@Override
	public void breaks() {
		System.out.println("Power breaks");
		
	}

}
