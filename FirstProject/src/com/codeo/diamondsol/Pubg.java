package com.codeo.diamondsol;

public interface Pubg extends MobileGame {
	
	
	default public void checkGameUpdates() {
		System.out.println("Check PUbg updates");
	}
	
	default public String mobileGame() {
			return "I am a Pugb mobile game";
			 
		 }
		public default String playGame() {
			return "you can play Pubg";
			
		}

}
