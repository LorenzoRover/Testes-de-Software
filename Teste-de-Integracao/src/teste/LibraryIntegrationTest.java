package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Library;

class LibraryIntegrationTest {
	
	private Library livraria;
	private Book livro;
	
	@BeforeEach
	public void setUp() {
		livraria = new Library();
		Book livro = new Book();
		
	}

	@Test
	void testAdicionarLivro() {
		livraria.addBook(null);
		
		assertEquals(1, livraria.getAvailableBooksCount());
		
	}
	

}
