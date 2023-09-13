package RSA_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// Call initElements() method by using PageFactory reference and pass driver and
		// this as parameters.
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@type='search']")
	WebElement searchBox;
	
	@FindBy(xpath = "//a[@class='increment']")
	private
	WebElement Qty_Increment;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement AddToCart;

	@FindBy(xpath = "//*[@alt='Cart']")
	static WebElement CartIcon;

	
	

	public void Search(String Item) {
		searchBox.sendKeys(Item);
	}
	
	public void AddToCart_2Qty() {
		getQty_Increment().click();
		AddToCart.click();
	}

	public WebElement getQty_Increment() {
		return Qty_Increment;
	}
	
	public WebElement get_CartIcon() {
		return CartIcon;
	}
	
	
	

}
