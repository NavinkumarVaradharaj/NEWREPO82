package Cucumbertest.nykaacucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumbertest.nykaacucumber.baseclass.Baseclass;


public class Babypowder extends Baseclass {
	//WebDriver driver = new ChromeDriver();
	
	
	public Babypowder(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//img[@class='css-11gn9r6']")
	private WebElement select_babypowder;
	
	public WebElement getSelect_babypowder() {
		return select_babypowder;
	}
	
	

}
