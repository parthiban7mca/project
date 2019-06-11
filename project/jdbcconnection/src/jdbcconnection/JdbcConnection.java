package jdbcconnection;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcConnection extends firstjdbc{
	
	firstjdbc jdbc=new firstjdbc();

	
	Scanner o=new Scanner(System.in); 
	int id;String firstname,lastname;
	
	
	public  void createTable() {
		try
		{
			jdbc. get_connection(); 
			PreparedStatement create= con.prepareStatement("CREATE TABLE IF NOT EXISTS studentinfo(id int NOT NULL AUTO_INCREMENT,first varchar(255),last varchar(255),PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		
	}
	

	public boolean findById(int id) throws Idreservedexception {

		if (id==1000) {
			System.err.println(">>>" + id);
			throw new Idreservedexception("Sorry above id reserved , kindly try diffrent one");
		} else {
			return true;
		}

	}
	
	
	public void insertTable()
	{
		
		
			try
			{
				
			jdbc.get_connection();
			PreparedStatement create= con.prepareStatement("insert into studentinfo values(?,?,?)");
			System.out.println("Enter ID:");
			
			 id=o.nextInt();
			 findById(id);
			 
			 /*student.setName(id);
			 student.getAge();
			 student.getStandard();*/
			create.setInt(1, id);
			
			System.out.println("Enter first name:");
			firstname=o.next();
			create.setString(2, firstname);
			System.out.println("Enter last name:");
			lastname=o.next();
			create.setString(3, lastname);
			create.executeUpdate();
			System.out.println("Successfully insert");
			
			}
		
					catch(Exception e) {System.out.println("This is:"+e);}
	}
	
	
	public  void updateTable() {
		try
		{
			jdbc. get_connection(); 
			PreparedStatement update= con.prepareStatement("update studentinfo set last=? where id=?");
			System.out.println("New last name & Enter ID for update: ");
			lastname=o.next();
			id=o.nextInt();
			update.setString(1,lastname);
			update.setInt(2,id);
			update.executeUpdate();
			System.out.println("Successfully updated");
		}
		/*catch(OtherThanIntException message)
		{
			System.out.println(id+"is not integer value");
		}*/
		catch(Exception e) {System.out.println(e);}
		
	}
	
	public void deleteTable() {
		try
		{
			jdbc.get_connection(); 
			PreparedStatement delete= con.prepareStatement("delete  from studentinfo where id=?");
			System.out.println("Enter student id for delete record:");
			delete.setString(1,o.next());
			delete.executeUpdate();
			System.out.println("Successfully deleted");
		}catch(Exception e) {System.out.println(e);}
		
	}
	
	/*public void viewTable()
	{
		try {
			jdbc.get_connection(); 
			PreparedStatement view= con.prepareStatement("select *from studentinfo");
			while(view.next())
			{
				
			}
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Function complete");
		}
	}*/
	
	
}

