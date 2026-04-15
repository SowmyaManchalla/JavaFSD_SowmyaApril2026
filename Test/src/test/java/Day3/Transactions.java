package Day3;

public class Transactions {

	public static void main(String[] args) {
		Person smith = new Person("Smith",30);
		Person kathy = new Person("Kathy",28);
		
		Account acc1=new SavingsAccount(1234, smith, 2000);
		Account acc2=new SavingsAccount(5678,kathy,3000);
		
	acc1.deposit(2000);
	acc2.withdraw(2000);
	
	System.out.println(acc1);
	System.out.println(acc2);
	}

}
