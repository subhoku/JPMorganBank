package com.codeo.diamondsol;

public interface Cod extends MobileGame {
	//default keyword
	//Whenever we want to define method in interface
	//we will use default keyword 
	default public void checkGameUpdates() {
		System.out.println("Check cod updates");
	}
	 default public String mobileGame() {
		return "I am a call of duty mobile game";
		 
	 }
	public default String playGame() {
		return "you can play call of duty";
		
	}

}
