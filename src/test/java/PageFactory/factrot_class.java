package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class factrot_class extends ChromeSetup{
	
	
	
	  
	  
	public factrot_class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//*[@type='search']")
private WebElement searchBox;

@FindBy(xpath = "//button[text()='ADD TO CART']")
private WebElement AddToCart;
@FindBy(xpath = "//*[@alt='Cart']")
private WebElement CartIcon;
@FindBy(xpath = "//*[text()='PROCEE TO CHECKOUT']")
private WebElement ProceedToChkout;

@Test
public  void TC_001() throws InterruptedException
{
	searchBox.sendKeys("Tomato");
	Thread.sleep(2000);
	AddToCart.click();
	Thread.sleep(2000);
	CartIcon.click();
	Thread.sleep(2000);
	ProceedToChkout.click();
	Thread.sleep(5000);
	
	
		
	
}





}
