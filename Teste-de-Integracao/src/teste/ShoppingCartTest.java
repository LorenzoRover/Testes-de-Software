package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Product;
import entidades.ShoppingCart;

class ShoppingCartTest {
	
	private ShoppingCart carrinho;
	private Product produto;
	
	@BeforeEach
	public void setUp() {
		carrinho = new ShoppingCart();
		produto = new Product("Maçã", 2.5);
	}

	@Test
	void testCarrinhoUnicoProduto() {
		ShoppingCart carrinho = new ShoppingCart();
		Product produto = new Product(null, 0);
		carrinho.addProduct(produto);
		
		assertEquals(1, carrinho.getProductCount());
	}
	
	@Test
	void testCarrinhoRemoverProduto() {
		ShoppingCart carrinho = new ShoppingCart();
		Product produto2 = new Product(null, 0);
		
		carrinho.addProduct(produto);
		carrinho.addProduct(produto2);
		carrinho.removeProduct(produto);
		
		assertEquals(1, carrinho.getProductCount());
	}
	
	@Test
	void testCarrinhoCalculoPreco() {
		ShoppingCart carrinho = new ShoppingCart();
		Product produto2 = new Product("Banana", 6);
		Product produto3 = new Product("Pera", 3);
		
		carrinho.addProduct(produto);
		carrinho.addProduct(produto2);
		carrinho.addProduct(produto3);
		
		assertEquals(11.5, carrinho.getTotalPrice());
	}
	
	@Test
	void testCarrinhoMultiProdutos() {
		ShoppingCart carrinho = new ShoppingCart();
		
		Product produto2 = new Product("Banana", 6);
		Product produto3 = new Product("Pera", 3);
		Product produto4 = new Product("Mamão", 4.5);
		Product produto5 = new Product("Melancia", 9);
		
		carrinho.addProduct(produto);
		carrinho.addProduct(produto2);
		carrinho.addProduct(produto3);
		carrinho.addProduct(produto4);
		carrinho.addProduct(produto5);
		
		carrinho.removeProduct(produto3);
		carrinho.removeProduct(produto2);
		
		assertEquals(3, carrinho.getProductCount());
		assertEquals(16, carrinho.getTotalPrice());
	}

}
