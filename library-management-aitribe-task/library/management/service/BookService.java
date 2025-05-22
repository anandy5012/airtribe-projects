
package library.management.service;

import java.util.*;

import library.management.model.Book;
import library.management.util.LoggerUtil;

/**
 * Provides book management services such as adding, removing, and searching books.
 */
public class BookService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        LoggerUtil.logInfo("Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
        LoggerUtil.logInfo("Book removed: " + isbn);
    }

    public void updateBook(Book book) {
        books.put(book.getIsbn(), book);
        LoggerUtil.logInfo("Book updated: " + book.getTitle());
    }

    public Book searchByIsbn(String isbn) {
        return books.get(isbn);
    }

    public List<Book> searchByTitle(String title) {
        return books.values().stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title)).toList();
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }
}
