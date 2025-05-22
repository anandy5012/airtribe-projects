
package library.management.model;

/**
 * Represents a book in the library.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, int publicationYear, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}
