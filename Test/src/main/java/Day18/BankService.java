package Day18;

public class BankService
{
	
private BankRepository bankRepository;

public BankService(BankRepository bankRepository)
{
  this.bankRepository = bankRepository;
 }

public double deposit(int accountNumber, double amount)
{
	Account account = bankRepository.findAccount(accountNumber);
	
     if(amount<=0)
     {
    	 throw new IllegalArgumentException("invalid amount");
}

account.setBalance(account.getBalance() + amount);

bankRepository.save(account);

return account.getBalance();
}
}

