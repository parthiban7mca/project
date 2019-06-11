package oops;

 class Super1{
	/*int a=5;
	public void Super()
	{
	System.out.println("superclass:");
	nested1 n=new nested1();
	n.nested11();
	}
	*/
	//nested11();
	
	 class nested1
	{
		 int b=10;
		 void nested11()
		{
			System.out.println("Hello supclass:");
		
		}
		 //Super1.o.Super();
	}
	 
	 static class C	//static inner class
	 {
	 int  y=20;  // inner class variable
	 void fun2()
	 {
	 System.out.println("Hello fun2()");
	 }
	 }
	
}

public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super1.nested1 o=new Super1().new nested1();
		o.nested11();
		//nested1 n1=new nested1()
		//n1.nested11();
		Super1.C s=new Super1.C();
		s.fun2();
		
		
	}

}
