package stepDefinition;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	
	@Given("Open Browser and Launch the URL")
	public void open_browser_and_launch_the_url() {
	   BaseMethods.openBrowser();
	   BaseMethods.launchERP();
	}
	@When("Enter the username and password and click on Login")
	public void enter_the_username_and_password_and_click_on_login() {
	   BaseMethods.loginERP();
	}
	@Then("Validate the LoginPage")
	public void validate_the_login_page() {
	   
	}

}
