package core;

import java.util.*;

interface bank {

	public void loginfunc();

	public void withdraw();

	public void deposit();

	public void balance();

	public void logout();
}

abstract class coreclass{
	abstract void coreMethod();
}

class login implements bank
{String cardno = "1234", card;
	String password = "asdf", pwd;
	int balance = 0, amount;
	int l1, p1, m;
	Scanner s = new Scanner(System.in);

	public void loginfunc() {
		
		System.out.println("Enter Card no:");
		card = s.nextLine();
		System.out.println("Enter PIN:");
		pwd = s.nextLine();
		if (card.equals(cardno) && pwd.equals(password)) {
			System.out.println("Success fully login");
			coreMethod();
		} 
		else {
			System.out.println("invalid username or password. Please enter again");
			loginfunc();
		}
	}

	public void withdraw() {

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
				coreMethod();
				break;

			default:

				System.out.println("Invalid Input");
				

		
				}
		}
		
		}
		else {
			System.out.println("Insufficient Balance");
			coreMethod();
		}

	}

	public void deposit() {

		System.out.print("Enter money to be deposit:");
		amount = s.nextInt();
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
				coreMethod();
			break;

		default:

			System.out.println("Invalid Input");
			

		}
	}
	}

	public void balance() {
		System.out.println("Balance : " + balance);
		while(true) {
			
		
		System.out.println("You want to continue press 1 for exit presstyty 0");
	
		switch (s.nextInt()) {
		case 0:

			System.out.println("You have  successsfully logout");
			System.exit(0);
			break;
		case 1:
			coreMethod();
			break;

		default:

			System.out.println("Invalid Input");
			
		}
		}
	}

	public void logout() {
		System.out.println("You have  successsfully logout");
		System.exit(0);

	}
	public void coreMethod()
	{
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
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			balance();
			break;
		case 4:
			logout();
		default:
			System.out.println("You have entered invalid options. Choose correct option!");
			coreMethod();
			
		}

	
}
}
}

public class Atmproject { // com.<projectname>.
	// Start CAPS - class
	// camelCase - varibles
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		login obj1 = new login();
		obj1.loginfunc();
		//obj1.core();
		
	}
}

//this
//super

//static

