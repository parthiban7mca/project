package com.atmproject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
//import com.atmproject.Atmmainclass;
 public class Atmclassone extends DBconnection implements Atmlogininterface,Atmmenuinterface{
	String  card,pwd;
	double balance = 0,amount;
	Scanner s = new Scanner(System.in);
	DBconnection dbobject=new DBconnection();
	public void Atmloginmethod() {
		// TODO Auto-generated method stub
		
		try {
		
				
			dbobject.get_connection();	
			System.out.println("Enter login ID:");
			card = s.nextLine();
			System.out.println("Enter PIN:");
			pwd = s.nextLine();
			PreparedStatement select= con.prepareStatement("select *from account ");
			
			ResultSet rs=select.executeQuery("select *from login where loginid='"+card+"'and passwords='"+pwd+"'");  
			if(rs.next())
			{
				System.out.println("login success");
			}
			else 
			{
				System.out.println("invaid login");
				Atmloginmethod();
			}
			/*if (card.equals(cardno) && pwd.equals(password)) {
				System.out.println("Success fully login");
				Atmmenumethod();
			} 
			else {
				System.out.println("invalid username or password. Please enter again");
				Atmloginmethod();
			}*/
			con.close(); 
	}catch(Exception e) {System.out.println(e);}
	}
	public void Atmlogoutmethod() {
		System.out.println("You have  successsfully logout");
		System.exit(0);
	
	}
	
	
	public void Atmwdmethod() {
		
		try{
			
		
		System.out.print("Enter amount to be withdrawn:");
		amount=s.nextInt();
		
		
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Please collect withdraw amount:" + amount + "\n" + "Your new balance is:" + balance);
			while(true)
			{
			System.out.println("You want to continue press 1 for exit press 0");
		
				switch (s.nextInt()) {
			
			
			case 0:

				System.out.println("You have  successsfully logout");
				System.exit(0);
				break;
			case 1:
				Atmmenumethod();
				break;

			default:

				System.out.println("Invalid Input");
				

		
				}
		}
		
		}
		else {
			System.out.println("Insufficient Balance");
			Atmmenumethod();
		}
		}catch(Exception e) {System.out.println(e);}

	}

	public void Atmdtmethod() {
		
		try {
			
		
		dbobject.get_connection();
		System.out.print("Enter money to be deposit:");
		amount = s.nextInt();
		PreparedStatement deposit= con.prepareStatement("insert into transactions values(?)");
		deposit.setDouble(1, amount);
		balance = balance + amount;
		System.out.println(
				"Your Money has been successfully depsited:" + amount + "\n" + "Your new balance amount:" + balance);
		while(true){System.out.println("You want to continue press 1 for exit press 0");
		
		
		switch (s.nextInt()) {
		case 0:

			System.out.println("You have  successsfully logout");
			System.exit(0);
			break;
		case 1:
			Atmmenumethod();
			break;

		default:

			System.out.println("Invalid Input");
			

		}
	}
		}catch(Exception e) {System.out.println(e);}
		
	}

	public void Atmbcmethod() {
		System.out.println("Balance : " + balance);
		while(true) {
			
		
		System.out.println("You want to continue press 1 for exit presstyty 0");
	
		switch (s.nextInt()) {
		case 0:

			System.out.println("You have  successsfully logout");
			System.exit(0);
			break;
		case 1:
			Atmmenumethod();
			break;

		default:

			System.out.println("Invalid Input");
			
		}
		}
	}
	public void Atmmenumethod()
	{
	  while(true)
	  {  
		System.out.println("choose the options:");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for EXIT");
		System.out.print("Choose the above option want to perform:");
			
		switch (s.nextInt())
		
			{
	
			case 1:
				 Atmwdmethod();
				break;
			case 2:
				Atmdtmethod();
				break;
			case 3:
				Atmbcmethod();
				break;
			case 4:
				Atmlogoutmethod();
			default:
				System.out.println("You have entered invalid options. Choose correct option!");
			}
	  }	
	}
}



	
		
	