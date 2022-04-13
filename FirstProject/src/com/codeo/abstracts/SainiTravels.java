package com.codeo.abstracts;

public class SainiTravels extends Bus{

	public SainiTravels(double fare, double gst, String BusName) {
		super(fare, gst, BusName);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void engineType() {
		System.out.println("Saini Travels uses avg engine");
		
	}

	@Override
	public void travellingFares() {
		double totalfare=fare+(gst*fare/100);
		System.out.println("The Ticket rate of "+busName+" will be"+totalfare);
		
	}



	@Override
	public void goldenCoins() {
		System.out.println("Golden coins are applicable for Saini travels");
		
	}





}
