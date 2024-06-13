package exercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

	@Test
	void testPasswordValidator() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "AAAAbbbb1111*";
		assertTrue(validador.validate(senha));
	}
	
	@Test
	void testPasswordLenghtFail() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "Ab1*";
		assertFalse(validador.validate(senha));
	}
	
	@Test
	void testPasswordLowerCaseFail() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "AAAABBBB1111*";
		assertFalse(validador.validate(senha));
	}

	@Test
	void testPasswordUpperCaseFail() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "aaaabbbb1111*";
		assertFalse(validador.validate(senha));
	}
	
	@Test
	void testPasswordDigitFail() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "aaaabbbb1111*";
		assertFalse(validador.validate(senha));
	}
	
	@Test
	void testPasswordSpecialCharFail() {
		PasswordValidator validador = new PasswordValidator();
		String senha = "aaaabbbb1111";
		assertFalse(validador.validate(senha));
	}

}
