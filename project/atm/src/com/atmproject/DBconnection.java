package com.atmproject;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection{  
	
	static  Connection con;
	 
	public void get_connection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","password");
			System.out.println("DB connected");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}  