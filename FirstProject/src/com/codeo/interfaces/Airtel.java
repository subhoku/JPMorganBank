package com.codeo.interfaces;

public class Airtel implements MobileTower {
	//By default all the methods declared at interface are abstract in nature

	@Override
	public void incommingCall() {
		System.out.println("Incomming call by Airtel");

	}

	@Override
	public void outgoingCall() {
		System.out.println("Outgoing call by Airtel");


	}

	@Override
	public void smsGatewayServices(double smsrate) {
		System.out.println("SMS rate for Airtel will be: "+smsrate);


	}

	@Override
	public void internetSerives(double tariffplan) {
		System.out.println("Internet Services by Airtel: "+tariffplan);

	}

}
