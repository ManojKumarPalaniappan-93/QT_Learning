package PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ChromeSetup {
	public  String baseUrl ="https://rahulshettyacademy.com/seleniumPractise/#/";
	 WebDriver driver;
	
	 @BeforeClass
	public  WebDriver Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		return driver;
		
	}
	 
	 @AfterClass
	 public  void Flush()
	 {
		 driver.quit();
	 }

}
