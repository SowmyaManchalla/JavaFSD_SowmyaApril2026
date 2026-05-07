package pac4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Account;

import static org.junit.jupiter.api.Assertions.*;
import service.BankService;

public class TC_testDeposit {
	
	 BankService bankService;
	 
	@BeforeEach()
	void setUp()
	{
		 bankService = new BankService();
		 
		 
		 //create sample account
		Account acc1 = new Account(100,"Sowmya", 5000);
		//add account service
		bankService.addAccount(acc1);
		
		
	}
	
	@Test
	
	void testCheckBalance()
	{
		Account result = bankService.checkbalance(100);
		
		assertEquals(101,result.getAccNo());
		assertEquals("Sowmya", result.getName());
		assertEquals(5000,result.getBalance());
	}
	
	@Test
	void testDepositsuccess()
	{
		bankService.deposit(100,2000);
		
		Account actualBalance = bankService.checkbalance(100);
		
		assertEquals(7000,actualBalance);
	}
	
	@Test
	void testDepositInvalidAmount()
	{
		bankService.deposit(100,-500);
		
		Account actualBalance = bankService.checkbalance(100);
		
		assertEquals(5000,actualBalance);
	}
}

