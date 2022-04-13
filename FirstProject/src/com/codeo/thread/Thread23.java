package com.codeo.thread;

public class Thread23 extends Thread {
	
       public void run() {
    	   for(int i=1;i<=10;i++) {
   			System.out.println("2*"+i+"="+(i*2));
   			
   		}
    	   try {
    		   Thread.sleep(2000);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
       
	public static void main(String[] args) {
		
		Thread23 t2=new Thread23();
		t2.start();
		Runnable r=new MyThread();  //polymorphism
		System.out.println(r);
		Thread t=new Thread(r);
		t.run();
		
		

	}

}
