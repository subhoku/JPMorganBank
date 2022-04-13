package com.codeo.thread;

public class Gcollection1 {
int obj_no;

	public Gcollection1(int obj_no) {
	super();
	this.obj_no = obj_no;
	System.out.println("Created: "+this.obj_no);
}

	

	public static void main(String[] args) {
	
		 Gcollection1 gc1=new Gcollection1(3);
		 gc1.finalize();
 for(int i=1;i<=10;i++) {
	 new Gcollection1(i);
 }
	}
	protected void finalize() {
		System.out.println("Deleted: "+this.obj_no);
	}

}
