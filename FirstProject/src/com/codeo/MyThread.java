package com.codeo;
//1. Used Runnable Interface
public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			int n=2*i;
			System.out.println(+n);
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
