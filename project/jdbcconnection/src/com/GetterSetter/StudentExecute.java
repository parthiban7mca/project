package com.GetterSetter;
//import com.GetterSetter.Dbconnectivity;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class StudentExecute extends Dbconnectivity{
	Dbconnectivity dbobj=new Dbconnectivity();
	Scanner s=new Scanner (System.in);
		public void insertTable()
		{			Student student = new Student();
			
				try
				{
					
				dbobj.get_connection();
				PreparedStatement create= con.prepareStatement("insert into studentinfo values(?,?,?)");
				System.out.println("Enter ID:");
				
				 student.setId(s.nextLong());
				 create.setLong(1,student.getId());
				 System.out.println("Enter FirstName:");
				 student.setName(s.next());
				 create.setString(2,student.getName());
				 System.out.println("Enter SecondName:");
				 student.setLastname(s.next());
				 create.setString(3,student.getLastname());
				create.executeUpdate();
				student.toString();
				}
			
				catch(Exception e) {System.out.println("This is:"+e);}
				System.out.println("Insert successfully");
		}
		
	}


