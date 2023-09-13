package Log4J;

import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4j_Implementation {
	private static final Logger logger = Logger.getLogger(Log4j_Implementation.class);
	public static void main(String[] args) {
		 //SimpleLayout layout = new SimpleLayout();
		 HTMLLayout layout = new HTMLLayout();
	        FileAppender appender = null;
	        try {
	            appender = new FileAppender(layout, "LOGS.html", false);
	            logger.addAppender(appender);
	            // To generate debug logs
	            logger.debug("Debug message");
	            // To generate info logs
	            logger.info("Info message");
	            // To generate warning logs
	            logger.warn("Warn message");
	            // To generate error logs
	            logger.error("Error message");
	            // To generate fatal logs
	            logger.fatal("Fatal Message!");
	        } 
	        catch (Exception e) {
	            System.out.println("Exception: " + e);
	        } 
	        finally {
	            appender.close();
	        }

	}

}
