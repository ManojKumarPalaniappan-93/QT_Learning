package RSA_Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.DriverSetup;

public class HomePageTest_withDataProvider extends DriverSetup{
	
	
	public  void WaitforClickable(WebElement ele) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "TestData", priority = 0) 
	public void TC1(String value) throws InterruptedException 
	{ 
	 Hp.Search(value);
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
	
	@DataProvider (name = "TestData")
    public Object[][] dpMethod(){
	 return new Object[][] {{"Mushroom"}, {"Rashberry"}};
    }
		 
}
