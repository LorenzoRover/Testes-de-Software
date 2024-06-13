package entidades;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean loanBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isLoaned()) {
                book.setLoaned(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isLoaned()) {
                book.setLoaned(false);
                return true;
            }
        }
        return false;
    }

    public int getAvailableBooksCount() {
        int count = 0;
        for (Book book : books) {
            if (!book.isLoaned()) {
                count++;
            }
        }
        return count;
    }
}
