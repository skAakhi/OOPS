package OOPS;
//Compile time
public abstract class Polymorphism {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
//	public void autofill()
//	{
//		System.out.println("Auto fill code");
//	}
	
	public abstract void autofill();
}

//Runtime
class WhatsApp extends Polymorphism{
	
	public void autofill() {System.out.println("WhatsApp auto fill code");}
	
}
class Telegram extends Polymorphism{
	
	public void autofill() {System.out.println("Telegram auto fill code");}
	
}


class cal{
	public static void main(String[] args) {
	
//		Polymorphism p=new Polymorphism();
//		p.add(10, 20);
//		p.add(22.22, 3);
//		p.add(22.45, 45.32);
		
		Polymorphism w=new WhatsApp();
		Polymorphism t=new Telegram();
		
		w.autofill();
		
	    t.autofill();
		
		
	}
}
