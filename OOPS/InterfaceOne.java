package OOPS;
//import java.util.*;
 public interface InterfaceOne {
	
	public void add();
	void read();
	public int work();
	

}

class Perrson implements InterfaceOne
{
	public void add()
	{
		System.out.println("Person is adding money");
	}
	
	public void read()
	{
		System.out.println("Person is reading money");
	}
	
	public int work()
	{
		System.out.println("Person is working in office");
		return 0;
	}
	
}

class User{
    public static void main(String[] args) {
		Perrson u=new Perrson();
		u.add();
	}
}



