package com.codeo.abstracts;

public class VrlTravels extends Bus {

	public VrlTravels(double fare, double gst, String BusName) {
		super(fare, gst, BusName);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void engineType() {
		
		
	}



	@Override
	public void travellingFares() {
		double totalfare=fare+(gst*fare/100);
		System.out.println("The Ticket rate of "+busName+" will be"+totalfare);
		
	}



	@Override
	public void goldenCoins() {
		// TODO Auto-generated method stub
		
	}



}
