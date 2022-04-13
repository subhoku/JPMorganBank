package com.codeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostGreSql {

	  public static void main(String args[]) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	    	  //Register the Driver
	         Class.forName("org.postgresql.Driver");
	         //Establish the connection ...
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/test",
	            "postgres", "Subho");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO accounts2 (user_id,username,password,email) "
	            + "VALUES (3, 'Reetu', 32, 'Vidharba');";
	         stmt.executeUpdate(sql);

	       

	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	   }
	}

