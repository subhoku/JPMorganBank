package com.codeo.interfaces;

public class Runner {

	public static void main(String[] args) {
		MobileTower airtel=new Airtel(); //Polymorphism
		airtel.incommingCall();
		airtel.outgoingCall();
		airtel.internetSerives(299);

		
	}

}
