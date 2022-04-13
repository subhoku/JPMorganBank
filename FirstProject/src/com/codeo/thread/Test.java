package com.codeo.thread;

public class Test extends Thread {
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("child"+i);
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child(Demon) Thread: Exists");
		
	}

	public static void main(String[] args) {
		Test child=new Test();
		child.setDaemon(false);
		child.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main: "+i);
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main(Non-Demon) Thread: Exists");

	}

}
