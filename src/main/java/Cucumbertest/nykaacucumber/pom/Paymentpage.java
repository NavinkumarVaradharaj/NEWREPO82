package Cucumbertest.nykaacucumber.pom;

//import static com.Nykaa.base.Baseclass.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumbertest.nykaacucumber.baseclass.Baseclass;


public class Paymentpage extends Baseclass  {
	
	//WebDriver driver = new ChromeDriver();
	
	public Paymentpage(WebDriver driver3)
	{
		driver = driver3;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='css-rxufl7 eoygcm00']")
	private WebElement select_bag;
	
	@FindBy(xpath = "//p[@class='css-z7wmhp eka6zu20']")
	private WebElement Edit;
	
	@FindBy(xpath = "(//span[@class='css-175whwo ehes2bo0'])[2]")
	private WebElement Delete;

	@FindBy(xpath = "(//button[@class='css-110s749 e8tshxd1'])[4]")
	private WebElement Removeitems_alert;

	public WebElement getSelect_bag() {
		return select_bag;
	}

	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getDelete() {
		return Delete;
	}

	public WebElement getRemoveitems_alert() {
		return Removeitems_alert;
	}
	
	
}
