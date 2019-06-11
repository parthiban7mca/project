package oops;

class sub1{
long salary=10000;
	
		 sub1()
	{
		System.out.println("parant calss"+salary);
	}
}
class sub2 extends sub1
{
	//long salary=2000;
	 sub2()
	{
		 super();
		 //super.display();
		 
	}
	void display()
	{
		System.out.println("Salary:"+salary);
	}
	
	
}
public class superkey {
	
	static {
		System.out.println("called static keyword");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub1 obj=new sub2();

//obj.sub2();
	}

}