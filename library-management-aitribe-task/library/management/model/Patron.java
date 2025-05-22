
package library.management.model;

import java.util.*;

/**
 * Represents a library patron.
 */
public class Patron {
    private String id;
    private String name;
    private List<String> borrowedBooks = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getBorrowedBooks() { return borrowedBooks; }
}
