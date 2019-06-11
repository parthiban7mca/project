package oops;
import java.util.*;




public class arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> name=new ArrayList<String>();
name.add("Dohoni");
name.add("Kholi");
name.add("Rohith");
name.add("Karthik");

System.out.println(name);
name.set(0,"Sachin");
System.out.println(name);
name.remove(3);
System.out.println(name);
System.out.println(name.size());

	}

}
