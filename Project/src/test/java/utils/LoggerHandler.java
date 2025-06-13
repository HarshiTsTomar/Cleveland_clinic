package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
 
/**
 * Author: Vignesh
 * LoggerHandler is a utility class for logging informational and error messages.
 * It also provides methods to log messages along with attribute text retrieved
 * from a web element in Selenium WebDriver.
 */
public class LoggerHandler {
 
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);
 
        static {
        setupLoggers();
    }
 
   
    private static void setupLoggers() {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = String.format("logs/logfile_%s.log", timestamp);
            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p %c - %m%n");
 
            FileAppender timestampedAppender = createFileAppender(logFileName, layout);
 
            logger.addAppender(timestampedAppender);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }
 
   
    private static FileAppender createFileAppender(String fileName, PatternLayout layout) throws Exception {
        return new FileAppender(layout, fileName, true);
    }
 
   
    public static void trace(String message) {
        logger.trace(message);
    }
 
   
    public static void debug(String message) {
        logger.debug(message);
    }
 
   
    public static void info(String message) {
        logger.info(message);
    }
 
   
    public static void warn(String message) {
        logger.warn(message);
    }
 
   
    public static void error(String message) {
        logger.error(message);
    }
 
   
    public static void fatal(String message) {
        logger.fatal(message);
    }
}
 