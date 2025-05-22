
package library.management;

import library.management.factory.BookFactory;
import library.management.model.Book;
import library.management.model.Patron;
import library.management.service.BookService;
import library.management.service.LendingService;
import library.management.service.PatronService;

/**
 * Entry point of the Library Management System.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize services
        BookService bookService = new BookService();
        PatronService patronService = new PatronService();
        LendingService lendingService = new LendingService(bookService, patronService);

        // Create and add a book
        Book book1 = BookFactory.createBook("Rich Dad", "Anand", "ISBN123", 2025);
        Book book2 = BookFactory.createBook("atomic habbit", "goldi", "ISBN124", 2025);
        Book book3 = BookFactory.createBook("7 priciple", "ajeet", "ISBN125", 2025);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        // Create and register a patron
        Patron patron = new Patron("A001", "jayhind");
        patronService.addPatron(patron);

        // Simulate book lending process
        lendingService.checkoutBook("ISBN123", "A001");
        lendingService.returnBook("ISBN123", "A001");
    }
}
