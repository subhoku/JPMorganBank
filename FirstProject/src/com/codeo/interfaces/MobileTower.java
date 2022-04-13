package com.codeo.interfaces;

public interface MobileTower {

	//In interface the methods which are declared
	//will be by default public static abstract
	public void incommingCall();
	public void outgoingCall();
	public void smsGatewayServices(double smsrate);
	public void internetSerives(double tariffplan);
	
}
