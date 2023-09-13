package RSA_Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Config.DriverSetup;

public class HomePageTest extends DriverSetup{
	
	/*
	 * static WebDriver driver; HomePage Hp; CheckoutPage Cp; WebDriverWait wait;
	 * 
	 * @BeforeTest public void setUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\ManojKumar\\Downloads\\116\\chromedriver.exe"); ChromeOptions
	 * options = new ChromeOptions();
	 * options.addArguments("--remote-allow-origins=*"); driver = new
	 * ChromeDriver(options); driver.manage().window().maximize(); String url =
	 * "https://rahulshettyacademy.com/seleniumPractise/#/"; driver.get(url);
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); Hp = new
	 * HomePage(driver); Cp = new CheckoutPage(driver); wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(20)); }
	 */
	
	public  void WaitforClickable(WebElement ele) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 0) 
	public void TC1() throws InterruptedException 
	{ 
	 Hp.Search("Tomato");
	 Thread.sleep(3000);
	 WaitforClickable(Hp.getQty_Increment());
	 Thread.sleep(3000);
	 Hp.AddToCart_2Qty();
	 WaitforClickable(Hp.get_CartIcon());
	 Thread.sleep(3000);
	 Cp.Navigate_CheckoutPage();
	 Thread.sleep(3000);
	 Cp.Verify_TotalAmount();
	 } 
	
	@Test(priority = 1, enabled = false) 
	public void TC2() throws InterruptedException 
	{ 
	 Hp.Search("Apple");
	 Thread.sleep(3000);
	 WaitforClickable(Hp.getQty_Increment());
	 Thread.sleep(3000);
	 Hp.AddToCart_2Qty();
	 WaitforClickable(Hp.get_CartIcon());
	 Thread.sleep(3000);
	 Cp.Navigate_CheckoutPage();
	 Thread.sleep(3000);
	 Cp.Verify_TotalAmount();
	 } 
	
		/*
		 * @AfterTest public void Flush() { driver.quit(); }
		 */ 
}
