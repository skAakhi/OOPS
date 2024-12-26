package OOPS;

public class Encapsulation {
 
	private int accountNumber;
	private double Bal;
	
    public Encapsulation(int acc,double Bal)
	{
		this.accountNumber=acc;
		this.Bal=Bal;
	}
	
	public int getAcc()
	{
		return accountNumber;
	}
	
	public double getBal()
	{
		return Bal;
	}
	
	public void setAcc(int accNum)
	{
		this.accountNumber=accNum;
	}
	
	public void setBal(int bal)
	{
		if(bal>=0)
		this.Bal=bal;
		else
			System.out.println("Balance cannot be negagtive");
	}
	
	public void deposit(double amount)
	{
		if(amount>0) {
		Bal+=amount;
		System.out.println("Deposited "+ Bal);
		}
		else {
			System.out.println("Invalid deposit");
		}
	}
	
	public void withdrawl(double amt)
	{
		if(amt>0 && amt<=Bal) {
			Bal-=amt;
			System.out.println("Withdrawl "+ Bal);
		}
		else {
			System.out.println("Insufficient amount ");
		}
	}	
}

class Account{
	public static void main(String[] args) {
		Encapsulation acc=new Encapsulation(50100,15000);
		
		System.out.println(acc.getAcc());
		System.out.println(acc.getBal());
		
		acc.setAcc(10050);//can modify same account using setter method
	    acc.setBal(42000);
	    
	    System.out.println(acc.getAcc());
		System.out.println(acc.getBal());
		
		acc.deposit(10000);
		acc.withdrawl(3000);
		
		//acc.setBal(-2);
		acc.withdrawl(52000);
		
	    
	    
	}
}
