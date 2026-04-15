package Day3;

class Bankaccount
{

private double balance()
{
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
}
}
public class TC_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bankaccount b = new Bankaccount();
        b.setBalance(1000);
        b.deposit(3000);
        System.out.println(b.getBalance());
	}

}

