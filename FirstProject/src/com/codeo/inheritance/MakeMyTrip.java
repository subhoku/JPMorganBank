package com.codeo.inheritance;

public class MakeMyTrip extends Indigo {

	
	public void TicketsByMakeMyTrip(double flightprice) {
		double finalprice;
		finalprice=flightprice-(10*flightprice/100);
		System.out.println("Ticket rate by Make my trip will be: "+finalprice);
	}
}
