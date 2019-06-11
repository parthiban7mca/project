package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		String mode = sca.next();
		
		if(mode != null ) {
			
               if(mode =="addval") {
            	   addvalues();
               }
               else if(mode == "updateval"){
       			updatevalues();
       		}
       		else if(mode == "deleteval") {
       			deletevalues();
       		}
       		else if(mode ==  "selectval") {
       			getvalues();
       		}
       		else {
       			System.out.println("Please give the correct inputs...!");
       		}
		}
		
	}

	public static void addvalues() {
		Scanner scan = new Scanner(System.in);
		int eid=scan.nextInt();
		String ename=scan.next();
		String edep = scan.next();
		int salary =scan.nextInt();
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Employee","root","root"); 
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("insert into Employeedata values("+eid+","+ename+","+edep+","+salary+")");
		if(rs.next()) {
	      System.out.println("Inserted records into the table...");
		}
	}
 
	      catch(Exception e) {
	    	  e.printStackTrace(); 
	      }
		scan.close();
	}
	
	public static void updatevalues() {
		Scanner scan = new Scanner(System.in);
		int eid=scan.nextInt();
		String ename=scan.next();
		String edep = scan.next();
		int salary =scan.nextInt();
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Employee","root","root"); 
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("update into Employeedata values("+eid+","+ename+","+edep+","+salary+") where eid="+eid+"");
		if(rs.next()) {
	      System.out.println("Updated records into the table...");
	}
	}
 
	      catch(Exception e) {
	    	  e.printStackTrace(); 
	      }
	scan.close();
		
	}
	
	
	public static void deletevalues() {
		Scanner scan = new Scanner(System.in);
		int eid=scan.nextInt();
		
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Employee","root","root"); 
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("delete  from Employeedata where eid="+eid+"");
		if(rs.next()) {
	      System.out.println("Deleted records from the table...");
		}
	}
 
	      catch(Exception e) {
	    	  e.printStackTrace(); 
	      }
	scan.close();
		
	}
	
	
	public static void getvalues() {		
		
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Employee","root","root"); 
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select * from Emolyeedata");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
			con.close(); 
	}
 
	      catch(Exception e) {
	    	  e.printStackTrace(); 
	      }
		
	}
	
	
	
}


