package Day18;

public interface BankRepository {
	
	Account findAccount(int accountNumber);
	
	void save(Account account);

}
