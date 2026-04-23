package util;

public class Transactionutil {
	
	public static double calculateninterest(double balance)
	{
		return balance*0.05;
	}
	
	public static boolean isvalidamount(double amount)
	{
		return amount>0;
	}

}
