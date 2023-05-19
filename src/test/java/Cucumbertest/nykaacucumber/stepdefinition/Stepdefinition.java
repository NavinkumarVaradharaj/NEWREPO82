package Cucumbertest.nykaacucumber.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.Set;



import Cucumbertest.nykaacucumber.baseclass.Baseclass;
import Cucumbertest.nykaacucumber.pom.PageobjectManager;

public class Stepdefinition extends Baseclass {

	PageobjectManager pom=new PageobjectManager(driver);
	
@Given("User launch the application")
public void user_launch_the_application() {
    // Write code here that turns the phrase above into concrete actions
	launchUrl("https://www.nykaa.com");

    //throw new io.cucumber.java.PendingException();
}
@When("search the baby powder product")
public void search_the_baby_powder_product() {
    // Write code here that turns the phrase above into concrete actions
	implicitWait();
	mouseHover(pom.getHp().getMomTab());
	clickOnElement(pom.getHp().getBabypowder());
   // throw new io.cucumber.java.PendingException();
}
@Then("user navigates to product page")
public void user_navigates_to_product_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Set<String> parent=driver.getWindowHandles();
	Iterator<String> itr=parent.iterator();
	itr.next();
	String Searchpage=itr.next();
	System.out.println(Searchpage);
	switchToWindow(Searchpage);
	implicitWait();
	scrollUsingCoordinates(0,400);
	
   // throw new io.cucumber.java.PendingException();
}


@Given("user selects the powder")
public void user_selects_the_powder() throws InterruptedException {
	
	Thread.sleep(4000);
	clickOnElement(pom.getBp().getSelect_babypowder());

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("user navigates to the product page")
public void user_navigates_to_the_product_page() {
    // Write code here that turns the phrase above into concrete actions
	
	Set<String> parent=driver.getWindowHandles();
	Iterator<String> itr=parent.iterator();
	itr.next();
	itr.next();
	String Selectpage=itr.next();
	switchToWindow(Selectpage);
	implicitWait();
	
	
	
  //  throw new io.cucumber.java.PendingException();
}
@Then("user changes the size of the product")
public void user_changes_the_size_of_the_product() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	selectFromDropDown(pom.getAp().getSelect_grams(), "value", "2");
	Thread.sleep(4000);
	
  //  throw new io.cucumber.java.PendingException();
}
@Then("user add the product to the bag")
public void user_add_the_product_to_the_bag() {
    // Write code here that turns the phrase above into concrete actions
	
	clickOnElement(pom.getAp().getAddtobag());
	implicitWait();
	clickOnElement(pom.getAp().getItemsbag());
	
   // throw new io.cucumber.java.PendingException();
}
@Then("user changes the quantity of the product in bag")
public void user_changes_the_quantity_of_the_product_in_bag() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user confirm the product")
public void user_confirm_the_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("user login the account by mobilenumber")
public void user_login_the_account_by_mobilenumber() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("user veriy the mobile number by otp")
public void user_veriy_the_mobile_number_by_otp() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("user navigates to payment method options")
public void user_navigates_to_payment_method_options() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("user gives the payment details to proceed")
public void user_gives_the_payment_details_to_proceed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}






}
