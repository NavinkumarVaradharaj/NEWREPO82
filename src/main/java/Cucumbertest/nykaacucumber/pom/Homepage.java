package Cucumbertest.nykaacucumber.pom;

import Cucumbertest.nykaacucumber.baseclass.Baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage extends Baseclass {
	
	public Homepage(WebDriver driver3)
	{
		driver = driver3;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebDriver driver = new ChromeDriver();
	
	@FindBy(xpath= "//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']")
	private WebElement momTab;
	
	@FindBy(xpath="//a[text()='Baby Powder']")
	private WebElement Babypowder;

	public WebElement getMomTab() {
		return momTab;
	}

	public WebElement getBabypowder() {
		return Babypowder;
	}

	
	
	
	
}
