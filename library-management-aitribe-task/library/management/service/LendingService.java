
package library.management.service;

import library.management.model.Book;
import library.management.model.Patron;
import library.management.util.LoggerUtil;

/**
 * Manages the lending process including book checkouts and returns.
 */
public class LendingService {
    private BookService bookService;
    private PatronService patronService;

    public LendingService(BookService bookService, PatronService patronService) {
        this.bookService = bookService;
        this.patronService = patronService;
    }

    public boolean checkoutBook(String isbn, String patronId) {
        Book book = bookService.searchByIsbn(isbn);
        Patron patron = patronService.getPatron(patronId);

        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            patron.getBorrowedBooks().add(isbn);
            LoggerUtil.logInfo("Book checked out: " + isbn + " by " + patronId);
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn, String patronId) {
        Book book = bookService.searchByIsbn(isbn);
        Patron patron = patronService.getPatron(patronId);

        if (book != null && patron.getBorrowedBooks().remove(isbn)) {
            book.setAvailable(true);
            LoggerUtil.logInfo("Book returned: " + isbn + " by " + patronId);
            return true;
        }
        return false;
    }
}
