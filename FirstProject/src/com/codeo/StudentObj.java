package com.codeo;

public class StudentObj {
	int rollno;
	String name;
	double percent;
	StudentObj sobj1;
	StudentObj sobj2;
	

	public StudentObj(int rollno, String name, double percent) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percent = percent;
	}
	


	public StudentObj(StudentObj sobj1, StudentObj sobj2) {
		super();
		this.sobj1 = sobj1;
		this.sobj2 = sobj2;
	}



	public StudentObj() {
		// TODO Auto-generated constructor stub
	}
   public void studentDetails() {
	   System.out.println(sobj1.name+" "+sobj1.rollno);
	   System.out.println(sobj2.name+" "+sobj2.rollno);
   }

	public static void main(String[] args) {
		
		StudentObj sobj1=new StudentObj(11,"sudarshan",67.76);
		StudentObj sobj2=new StudentObj(12,"siddesh",78.98);
		StudentObj sobj3=new StudentObj(sobj1,sobj2);
		sobj3.studentDetails();
        
	}

}
