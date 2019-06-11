package oops;
import java.util.*;

public class Exception1 {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		int a,b, ans;
		Scanner s=new Scanner(System.in);
		Divzero dz=new Divzero();
		try
		{
			System.out.println("Enter A:");
			a=s.nextInt();
			System.out.println("Enter B:");
			b=s.nextInt();
			dz.division(a,b);
			//ans=a/b;
			
			//System.out.println("Answer:"+ans);
			
		}
		/*catch (ArithmeticException ae)
		{
			System.out.println("Denominator not be zero");
		}*/
		catch (Exception e)
		{
			System.err.println(e);	
		}
		
		try {
		int arr[]= {1,3,5,7};
		System.out.println(arr[4]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e);
		}
		
		
		System.out.println("Rest of the code");
		
		
	}
	}


