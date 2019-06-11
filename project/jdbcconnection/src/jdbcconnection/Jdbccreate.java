package jdbcconnection;

import java.util.Scanner;

public class Jdbccreate{
	
	public static void main(String[] args) throws Idreservedexception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	
		//student.insertTable();
		JdbcConnection ojdbc=new JdbcConnection();
		while(true) 
		{
			System.out.println("Student Info DB functions");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
		
			
			switch(s.nextInt())
			{
			case 1:
				
					ojdbc.insertTable();
					break;
			case 2:
				
				ojdbc.updateTable();
				break;
			case 3:
				
				ojdbc.deleteTable();
				break;
			
			default:
				s.close();
				break;
		
			}
		}
		
	}
	

}
