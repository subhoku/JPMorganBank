package com.codeo.abstracts;

public class Runner {

	public static void main(String[] args) {
	Bus sainitravels=new SainiTravels(300, 9,"Saini Travles"); //Polymorphism
  sainitravels.travellingFares();
  sainitravels.goldenCoins();
  sainitravels.demo();
	Bus vrltravels=new VrlTravels(350, 9,"VRL Travels");
    vrltravels.travellingFares();

	}

}
