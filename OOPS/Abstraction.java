package OOPS;

public interface Abstraction {
	
	void autocall();
	void autospeak();
	void autodrive();
	
	default void autosuggest()
	{
		System.out.println("sandra is suggesting");
	}
	
	static void autosolve()
	{
		System.out.println("sandra is solving");
	}
}

abstract class google implements Abstraction{

	@Override
	public void autocall() {
		System.out.println("Google auto calling");
		
	}

	@Override
	public abstract void autospeak();

	@Override
	public abstract void autodrive();
	
	
}


class amazon extends google{

	@Override
	public void autospeak() {
		System.out.println("Amazon autospeak code");
		
	}

	@Override
	public void autodrive() {
		System.out.println("Amazon autodrive code");
		
	}
	
}


class intel extends google{

	@Override
	public void autospeak() {
		System.out.println("Intel autospeak code");
		
	}

	@Override
	public void autodrive() {
		System.out.println("Intel autodrive code");
		
	}
	
}



class company{
	public static void main(String[] args) {
		
		google a=new amazon(); // or Abstraction a=new amazon();-->points to interface
		a.autocall();
		a.autodrive();
		a.autospeak();
		
		google i=new intel();//or Abstraction i = new intel();--->points to interface
		i.autocall();
		i.autodrive();
		i.autospeak();
	}
}
