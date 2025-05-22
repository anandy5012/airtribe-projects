
package library.management.factory;

import library.management.model.Book;

/**
 * Factory class for creating Book instances.
 */
public class BookFactory {
    public static Book createBook(String title, String author, String isbn, int year) {
        return new Book(title, author, isbn, year, true);
    }
}
