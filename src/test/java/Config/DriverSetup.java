package Config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import RSA_Pages.CheckoutPage;
import RSA_Pages.HomePage;

public class DriverSetup {
	static WebDriver driver;
	 public HomePage Hp;
	 public CheckoutPage Cp;
	 public WebDriverWait wait;
	 
	 
	 
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Hp = new HomePage(driver); 
		 Cp = new CheckoutPage(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@AfterSuite
	public void Flush() 
	{ 
	  driver.quit(); 
	 } 
}
