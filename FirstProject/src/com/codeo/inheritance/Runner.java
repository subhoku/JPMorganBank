package com.codeo.inheritance;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter Booking mode");
            String bookingmode=sc.next();
            Indigo indigo=new Indigo();
            MakeMyTrip mmt=new MakeMyTrip();
            mmt.SpecialDiscount();
            Yatracom yatra=new Yatracom();
            if(bookingmode.equals("Indigo")) {
            	indigo.bookingByAirport();
            }
            else if(bookingmode.equals("MakeMyTrip")|| bookingmode.equals("Yatra.com") ) {
            	mmt.TicketsByMakeMyTrip(Indigo.ticketPricen2d);
            	System.out.println("Normal Ticket Nag==>Delhi "+Indigo.ticketPricen2d);
            	mmt.TicketsByMakeMyTrip(Indigo.ticketPricen2m);
            }
            else if(bookingmode.equals("Yatra.com")) {
            	yatra.TicketsByYatracom(Indigo.ticketPricen2d);
            	yatra.TicketsByYatracom(Indigo.ticketPricen2m);
            	
            }
            else {
            	System.out.println("Incorrect Input");
            }
	}

}
