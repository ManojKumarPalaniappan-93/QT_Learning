package TestNG_Conecpts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(TestNG_Listeners.class)
public class MyFirstName {
	//public String baseUrl = "https://rahulshettyacademy.com/seleniumPractise/#/";
	public String baseUrl ="https://rahulshettyacademy.com/seleniumPractise/#/";
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	
	@Test()

	public void TC_001()
	{
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Tomato");
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		//driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		//driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	}
	
	@Test()
	
	public void TC_002()
	{
		
			//driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Tomato");
			//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.findElement(By.xpath("//*[@alt='Cart']")).click();
			driver.findElement(By.xpath("//*[text()='PROCEE TO CHECKOUT']")).click();
		
	}
	
//@Test()
	
/*
 * public void A_TC_003() { System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
 * //WebDriverManager.chromedriver().setup();
 * 
 * ChromeOptions options = new ChromeOptions();
 * options.addArguments("--remote-allow-origins=*"); driver = new
 * ChromeDriver(options); driver.get(baseUrl);
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
 * driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Tomato");
 * driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
 * driver.findElement(By.xpath("//*[@alt='Cart']")).click();
 * driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
 * 
 * }
 */
	
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
	
	

}
