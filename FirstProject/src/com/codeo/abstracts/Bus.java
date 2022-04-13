package com.codeo.abstracts;

public abstract class Bus {
	//In Abstract class their might be concrete methods
	double fare;
	double gst;
	String busName;//saini travels//VRL travels
	
	public Bus(double fare, double gst,String BusName) {
		super();
		this.fare = fare;
		this.gst = gst;
		this.busName=BusName;
	}
	//declare an Abstract
	public abstract void engineType();
	public abstract void travellingFares();
	public abstract void goldenCoins();
	//define concrete Method
	
	public void discountCoupon() {
		System.out.println("Discount coupon at affordable price");
	}
	public void demo() {
		double totalfare=fare+(gst*fare/100);
		System.out.println("The Ticket rate of "+busName+" will be"+totalfare);
		
	}
	
}
