
package library.management.service;

import java.util.*;

import library.management.model.Patron;
import library.management.util.LoggerUtil;

/**
 * Provides patron management functionalities.
 */
public class PatronService {
    private Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
        LoggerUtil.logInfo("Patron added: " + patron.getName());
    }

    public void updatePatron(Patron patron) {
        patrons.put(patron.getId(), patron);
        LoggerUtil.logInfo("Patron updated: " + patron.getName());
    }

    public Patron getPatron(String id) {
        return patrons.get(id);
    }
}
