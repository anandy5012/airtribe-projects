
package library.management.util;

import java.util.logging.*;

/**
 * Utility class for logging events and errors.
 */
public class LoggerUtil {
    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    public static void logInfo(String message) {
        LOGGER.log(Level.INFO, message);
    }

    public static void logError(String message) {
        LOGGER.log(Level.SEVERE, message);
    }
}
