package com.codeo.diamondsol;

public class PUCO implements Pubg,Cod {

	
	public void callBaseClassesMethod() {
		System.out.println(Cod.super.mobileGame());
		System.out.println(Cod.super.playGame());
		
		System.out.println(Pubg.super.mobileGame());
		System.out.println(Pubg.super.playGame());
		
		
	}
	public static void main(String[] args) {
	
		PUCO puco=new PUCO(); //Derieved class object
		puco.callBaseClassesMethod();
		puco.checkGameUpdates();
		System.out.println("=================");
		puco.weekendSpecial();
		System.out.println("  "+puco.mobileGame());
		System.out.println("  "+puco.playGame());

	}

	@Override
	public String mobileGame() {
		return "PUCO Mobile game for android";
		
		
	}

	@Override
	public String playGame() {
	return "Playing game";
		
	}
	@Override
	public void checkGameUpdates() {
		// TODO Auto-generated method stub
		Cod.super.checkGameUpdates();
		Pubg.super.checkGameUpdates();
	}

}
