package oops;
import java.util.*;
public class Testcustomexception1 {

	  static void validate(int age)throws InvalidAgeException{
		     if(age<18)
		      throw new InvalidAgeException("not valid");
		     else
		      System.out.println("welcome to vote");
		   }
		   
		   public static void main(String args[]){
			   Scanner s=new Scanner(System.in);
		      try{
		    	  int age;
		    	  System.out.println("Enter your age:");
		    	  age=s.nextInt();
		      validate(age);
		      }catch(Exception m){System.out.println("Exception occured: "+m);}

		      System.out.println("rest of the code...");
		  }

	}


