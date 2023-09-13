package TestNG_Conecpts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Concepts_1 {
	public String baseUrl = "https://rahulshettyacademy.com/seleniumPractise/#/";
	public WebDriver driver ;

	@BeforeClass
	@Parameters("Name")
	public void Setup() {
		//System.out.println(name);
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	@Test
	public void AddItem() {
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Tomato");
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	}
	
	@Test
	public void AddItem1() {
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Tomato");
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	}

	@AfterClass
	public void Teardown()
	{
		driver.quit();
	}
}
