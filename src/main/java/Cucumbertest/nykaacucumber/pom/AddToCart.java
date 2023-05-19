package Cucumbertest.nykaacucumber.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumbertest.nykaacucumber.baseclass.Baseclass;

public class AddToCart extends Baseclass  {

	public AddToCart(WebDriver driver2)
	{
		driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@class='css-2t5nwu']")
	private WebElement select_grams;
	
	@FindBy(xpath = "(//span[@class='btn-text'])[1]")
	private WebElement Addtobag;
	
	@FindBy(xpath = "//div[text()='View Bag']")
	private WebElement itemsbag;
	
	@FindBy(xpath = "//p[@data-test-id='select-quantity']")
	private WebElement Quantity;
	
	@FindBy(xpath = "//span[@value='3']")
	private WebElement Quantity_value;
	
	@FindBy(xpath = "(//button[@class='css-1j2bj5f e8tshxd0'])[2]")
	private WebElement Proceed;

	public WebElement getSelect_grams() {
		return select_grams;
	}

	public WebElement getAddtobag() {
		return Addtobag;
	}

	public WebElement getItemsbag() {
		return itemsbag;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getQuantity_value() {
		return Quantity_value;
	}

	public WebElement getProceed() {
		return Proceed;
	}
	
	
	
}
