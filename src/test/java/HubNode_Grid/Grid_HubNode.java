package HubNode_Grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_HubNode {
	 public static String remote_url = "http://localhost:4444";
	 //protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = null;
		ChromeOptions chromeOptions = new ChromeOptions();
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability(CapabilityType.BROWSER_NAME,"chrome");
	    caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    driver = new RemoteWebDriver(new URL("http://localhost:4444/"), caps);
		// TODO Auto-generated method stub
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        //driver.quit();
	}

}
