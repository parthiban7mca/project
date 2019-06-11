package oops;

public class Divzero {
	public void division(int a, int b)throws ArithmeticException
	{
	if(b==0)
	{
	ArithmeticException ae=new ArithmeticException("Does not enter zero for Denominator");
	throw ae;
	}
	else
	{
	int c=a/b;
	System.out.println("Result: "+c);
	}
	}
	/*public void arrayind(int i)throws ArrayIndexOutOfBoundsException
	{
		
		ArrayIndexOutOfBoundsException aiobe=new ArrayIndexOutOfBoundsException("Exceeded array the index value"); 
		
	}**/
}
