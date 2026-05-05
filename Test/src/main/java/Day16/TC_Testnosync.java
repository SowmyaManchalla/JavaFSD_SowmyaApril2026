package Day16;

class BankAccount
{
	int balance = 1000;
	void withdraw(int amount)
	{
		if(balance>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" is drawing...");
			try
			{
				Thread.sleep(1000);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			balance = balance-amount;
			System.out.println("Remaining balance:"+balance);
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}

public class TC_Testnosync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		Runnable task = () -> acc.withdraw(700);
		
		Thread t1 = new Thread(task, "user1");
		Thread t2 = new Thread(task, "user2");
		
		t1.start();
		t2.start();

	}

}
