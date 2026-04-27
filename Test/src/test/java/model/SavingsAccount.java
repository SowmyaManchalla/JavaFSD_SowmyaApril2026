package model;

import exception1.InsufficientBalanceException;

//inheritance and polymorphism

public class SavingsAccount extends Account{
	
	private static final double MIN_BALANCE=500;
	
	public SavingsAccount(int accNo,String name, double balance)
	{
		super(accNo,name,balance);
	}
	
	//Method overriding 
	
	/*public void withdraw(double amount)
	{
		if(getBalance()-amount>=MIN_BALANCE)
		{
			setBalance(getBalance()-amount);
			System.out.println("Withdraw successful");
		}
		
		else
		{
			System.out.println("Minimum balance required");
		}
	}*/
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if(getBalance()-amount<MIN_BALANCE)
		{
			throw new InsufficientBalanceException("Maintain minimum balance of 500");
		}
		setBalance(getBalance()-amount);
		}

}
