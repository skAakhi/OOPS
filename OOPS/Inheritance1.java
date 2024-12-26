package OOPS;

public class Inheritance1 {
	
	public void read() {
		System.out.println("Read");
	}

}

class Inheritance2 extends Inheritance1{
	
	public void read() {
		System.out.println("Cannot Read");
	}
	
	public void write() {
		System.out.println("Write a code");
	}
}


class Inheritance3 extends Inheritance2{
	
	public void delete() {
		System.out.println("Delete application");
	}
	public void read() {
		super.read();
	}
}

class Inheritance4 extends Inheritance3{
	
	
	public void update() {
		System.out.println("Updated");
	}
	public void read() {
		super.read();
	}
	public Inheritance4(Inheritance3 u3)
	{
		u3.read();
	}
}


class one{
	public static void main(String[] args) {
		Inheritance3 u3=new Inheritance3();
		Inheritance2 u2=new Inheritance2();
		//Inheritance4 u4=new Inheritance4();
		Inheritance4 u4=new Inheritance4(u3);
		
		u3.delete();
		u3.read();
		u3.write();
		
		u4.read();
		
	}
}

