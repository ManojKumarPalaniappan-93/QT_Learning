package RSA_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage {
	 private WebDriver driver;
	 

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		// Call initElements() method by using PageFactory reference and pass driver and
		// this as parameters.
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='PROCEED TO CHECKOUT']")
	WebElement ProceedToChkout;
	
	@FindBy(xpath = "(//p[@class='amount'])[1]")
	WebElement Price;
	
	@FindBy(xpath = "(//p[@class='quantity'])[1]")
	WebElement Qty;
	
	@FindBy(xpath = "(//p[@class='amount'])[2]")
	WebElement TotalAmount;
	
	
	
	
	public void Navigate_CheckoutPage() throws InterruptedException {
		HomePage.CartIcon.click();
		Thread.sleep(2000);
		ProceedToChkout.click();
	}
	
	public void Verify_TotalAmount() throws InterruptedException {
		Thread.sleep(5000);
		String str_Price = Price.getText();
		String str_Qty = Qty.getText();
		String Act_Total = TotalAmount.getText();
		int Price = Integer.parseInt(str_Price);
		int Qty = Integer.parseInt(str_Qty);
		int Exp_Total = Price * Qty;
		Assert.assertEquals(Integer.toString(Exp_Total), Act_Total);
	}
}
