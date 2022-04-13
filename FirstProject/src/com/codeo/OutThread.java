package com.codeo;
//by extending Thread class
public class OutThread extends Thread {

	public void run() {
		for(int i=1; i<=10;i++) {
			int n=5*i;
			System.out.println(+n);
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	
	public static void main(String[] args) {
		
		
		Thread t1=new Thread();// Inheritance
		t1.start();
		OutThread ot=new OutThread();
		ot.start();
		//java.lang pakage
				Runnable r=new MyThread();//Polymorphism
				
				Thread t=new Thread(r);
				t.run();
		

	}

}
