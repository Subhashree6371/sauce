package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	@Given("the user is on saucedemo login page")
	public void the_user_is_on_saucedemo_login_page() {
		System.out.println("the user is on saucedemo login page");
	}
	
	@When("the user login into the application with {string} and {string}")
	public void the_user_login_into_the_application_with(String username,String password) {
	   System.out.println("Username:" +username);
	   System.out.println("password:" +password);
	}
	
	@And("click the login button")
	public void click_the_login_button() {
		System.out.println("click the login button");
	}
	
	@Then("the product page is displayed")
	public void the_product_page_is_displayed() {
		System.out.println("the product page is displayed");
	}
	
	
	
	
}