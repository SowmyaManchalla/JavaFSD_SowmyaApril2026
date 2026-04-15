package Day3;

public class SavingsAccount extends Account{
	public SavingsAccount(int accNum,Person accHolder,double balance)
	{
		super(accNum,accHolder,balance);
	}
	
public void withdraw(double amount)
{
	if(balance>=amount+500)
	{
		balance-=amount;
	}
	else
	{
		System.out.println("Minimum balance of 500 should be maintained");
	}
}
}

