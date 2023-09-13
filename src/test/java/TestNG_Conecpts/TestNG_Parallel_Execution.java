package TestNG_Conecpts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parallel_Execution {
	
	@Test
    public void ChromeTest1() throws InterruptedException {	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.quit();
     }
	
	@Test
	public void ChromeTest2() throws InterruptedException {	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.quit();
		
     }
	
	@Test
	public void ChromeTest3() throws InterruptedException {	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.quit();
     }
	
	@Test
	public void ChromeTest4() throws InterruptedException {	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.quit();
     }
	
	@Test
	public void ChromeTest5() throws InterruptedException {	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.guru99.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.quit();
     }
}
