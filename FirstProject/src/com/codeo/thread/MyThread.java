package com.codeo.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Value after implementing Runnable: "+i);
			
		}
		  try {
   		   Thread.sleep(2000);
   	   }
   	   catch(InterruptedException e) {
   		   e.printStackTrace();
   	   }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}

}
