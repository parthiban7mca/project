package oops;
import java.util.Scanner;  
public class Primeornot {
	  
	   public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       for(int i=0;i<7;i++) {
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	      
	       if(n%2==0 && n%3==0  && n%5==0  ) {
			  System.out.println("   prime");
			  
		  }else {
			  
			  System.out.println(" not  prime");
		  }
	  
	   }}  
	}  


