package Cucumbertest.nykaacucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Cucumbertest.nykaacucumber.baseclass.Baseclass;


public class PageobjectManager extends Baseclass {

	public PageobjectManager(WebDriver driver4)
	{ driver=driver4;
		
	  PageFactory.initElements(driver4, this);
	}
	
	
	private Homepage hp;
	private Babypowder bp;
	private AddToCart Ap;
	private Paymentpage pp;
	


	public Homepage getHp() {
		 hp=new Homepage(driver);
		return hp;
	}


	public Babypowder getBp() {
		 bp=new Babypowder(driver);
		return bp;
	}

	
	public AddToCart getAp() {
		 Ap=new AddToCart(driver);
		return Ap;
	}

	

	public Paymentpage getPp() {
		 pp=new Paymentpage(driver);
		return pp;
	}

	

	
}
