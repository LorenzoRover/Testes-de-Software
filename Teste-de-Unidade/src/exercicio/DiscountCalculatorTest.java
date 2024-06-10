package exercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

	@Test
	void testDiscountCalculator() {
		DiscountCalculator desconto = new DiscountCalculator();
		double preco = 500.0;
		double porcentagem = 50.0;
		
		assertEquals(250.0, desconto.calculateDiscount(preco, porcentagem));
	}
	
	@Test
	void testDiscountPrecoFail() {
		DiscountCalculator desconto = new DiscountCalculator();
		double preco = -100.0;
		double porcentagem = 50.0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			desconto.calculateDiscount(preco, porcentagem);
        });
	}
	
	@Test
	void testDiscountPorcentagemAcimaFail() {
		DiscountCalculator desconto = new DiscountCalculator();
		double preco = 2000.0;
		double porcentagem = 110.0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			desconto.calculateDiscount(preco, porcentagem);
        });
	}
	
	@Test
	void testDiscountPorcentagemAbaixoFail() {
		DiscountCalculator desconto = new DiscountCalculator();
		double preco = 2000.0;
		double porcentagem = -20.0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			desconto.calculateDiscount(preco, porcentagem);
        });
	}

}
