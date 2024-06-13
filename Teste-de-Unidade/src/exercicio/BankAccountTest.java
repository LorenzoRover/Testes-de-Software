package exercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	public void testWithdraw() {
		BankAccount banco = new BankAccount(1200.0);
		double valor = 500.0;
		banco.withdraw(valor);
		assertEquals(700.0, banco.getBalance());
	}
	
	@Test
	public void testWithdrawFail() {
		BankAccount banco = new BankAccount(1000.0);
		double valor = 1500.0;
		assertThrows(IllegalArgumentException.class, () -> {
            banco.withdraw(valor);
        });
	}
	
	@Test
	public void testDeposit() {
		BankAccount banco = new BankAccount(0.0);
		double valor = 500.0;
		banco.deposit(valor);
		assertEquals(500.0, banco.getBalance());
	}
		
	@Test
	public void testBalance() {
		BankAccount banco = new BankAccount(0.0);
		banco.deposit(1000.0);
		assertEquals(1000.0, banco.getBalance());
	}

}
