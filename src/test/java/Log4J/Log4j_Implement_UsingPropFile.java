package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log4j_Implement_UsingPropFile {
	 private static Logger logger = Logger.getLogger(Log4j_Implement_UsingPropFile.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("E:\\WORKSPACE\\SeleniumGrid\\src\\test\\java\\Log4J\\log4j.properties");

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);

	    logger.debug("Starting test");
	    driver.get("https://www.google.com");
	    logger.info("Opened Google website");
	    String title = driver.getTitle();
	    logger.debug("Page title: " + title);
	    if (title.equals("Google")) {
	      logger.info("Title is correct");
	    } else {
	      logger.error("Title is incorrect");
	    }
	    //driver.quit();
	    logger.debug("Test complete");                                                       

	}

}
