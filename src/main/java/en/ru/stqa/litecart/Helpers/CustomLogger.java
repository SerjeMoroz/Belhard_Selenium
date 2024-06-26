package en.ru.stqa.litecart.Helpers;

import io.cucumber.junit.Cucumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static final Logger logger = LoggerFactory.getLogger(Cucumber.class);

    public static <T> void loggerInfoGreen (String text, T param) {
        logger.info(ANSI_GREEN + text + "{}", param + ANSI_RESET);
    }

    public static <T> void loggerInfoRed (String text, T param) {
        logger.info(ANSI_RED + text + "{}", param + ANSI_RESET);
    }

    public static <T> void loggerInfoYellow(String text, T param) {
        logger.info(ANSI_YELLOW + text + "{}", param + ANSI_RESET);
    }

}
