package service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import Day18.Account;
import Day18.BankRepository;
import Day18.BankService;

public class BankServiceTest {
	
	@Mock
	private BankRepository bankRepository;
		
		private BankService bankService;
		
		
	
		@BeforeEach
		void setUp()
		{
			MockitoAnnotations.openMocks(this);
			bankService = new BankService(bankRepository);
			
		}
		@Test
		void testDeposit()
		{
			Account account = new Account();
			account.setAccountNumber(101);
			account.setBalance(5000);
			
			when(bankRepository.findAccount(101)).thenReturn(account);
			
			double result = bankService.deposit(101, 1000);
			
			assertEquals(6000,result);
			
			verify(bankRepository).save(account);
		}
	}

