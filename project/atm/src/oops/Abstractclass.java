package oops;

abstract class shape{
	abstract int draw();
	int i;
	
}

class rectangle extends shape

{
	int draw()
	{
		System.out.println("draw rectangle:"+this.i);
		return 7;
	}
}
class circle extends shape
{
	int draw()
	
	{
		System.out.println("Draw circle:"+i);
		return 10;
	}
}

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s;

s=new circle();

System.out.println("Rectangle:"+s.draw());
s=new rectangle();
System.out.println("circle:"+s.draw());


	}

}
