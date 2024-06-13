package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.BankAccount;

class BankAccountTest {
	
	private BankAccount conta;
	
	@BeforeEach
	public void setUp() {
		conta = new BankAccount(1500.0);
	}

	@Test
	void testAdicionarFundos() {
		conta.deposit(500.0);
		
		assertEquals(2000.0, conta.getBalance());
	}
	
	@Test
	void testSacarFundos() {
		conta.withdraw(450.0);
		
		assertEquals(1050.0, conta.getBalance());
	}
	
	@Test
	void testFundosInsuficiente() {
		conta.withdraw(1550.0);
		
		assertEquals(1500.0, conta.getBalance());
	}
	
	@Test
	void testDepositosESaques() {
		conta.withdraw(1000.0);
		conta.deposit(550.0);
		conta.deposit(300.0);
		conta.withdraw(800.0);
		conta.withdraw(500.0);
		
		assertEquals(50.0, conta.getBalance());
	}

}
