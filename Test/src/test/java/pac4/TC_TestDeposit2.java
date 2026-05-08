package pac4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import service.BankService;

public class TC_TestDeposit2 {
	
	BankService bankService = new BankService();
	
	/*@ParameterizedTest
	@CsvSource
	({
		"1001,Sowmya, 3000,'Amount 3000 deposited successfully to account number : 1001 ",
		"1001,Varsha, -500, 'Invalid deposiT amount'", "1001,0,'Invalid deposit amount"
	})
	
	void testDeposit(int accNo,String name,double amount,String expected)
	{
		String result = bankService.deposit(accNo, amount);
		assertEquals(expected, result);
	}
	*/
	@ParameterizedTest
	@CsvFileSource
	(resources = "/testdata.csv",numLinesToSkip = 1)
	
	
	void testDepositfromCsv(int accNo,String name,double amount,String expected)
	{
		String result = bankService.deposit(accNo, amount);
		assertEquals(expected, result);
	}
	

}
