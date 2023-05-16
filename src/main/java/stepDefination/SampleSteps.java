package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {

	@Given("^user launch the browser and load application url$")
	public void user_launch_the_browser_and_load_application_url() {
		System.out.println("STEP - Browser Launch and URL loaded");
	}

	@When("^user enter \"([^\"]*)\" as username on login page$")
	public void user_enter_as_username_on_login_page(String arg1) throws Throwable {
	}

	@When("^user enter \"([^\"]*)\" as password on login page$")
	public void user_enter_as_password_on_login_page(String arg1) throws Throwable {
	}

	

	@Then("^user should be navigate to dashboard page$")
	public void user_should_be_navigate_to_dashboard_page() throws Throwable {
		System.out.println("VERIFY - Dashboard page is display");
	}

	@Then("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\" on login page$")
	public void user_enter_username_as_and_password_as_on_login_page(String arg1, String arg2) throws Throwable {
		System.out.println(arg1 + " : " + arg2);
	}

	@Given("^user open browser and launch url$")
	public void user_open_browser_and_launch_url() throws Throwable {
		System.out.println("STEP - Browser Launch");
	}

	@When("^user enter username as \"([^\"]*)\" on login page$")
	public void user_enter_username_as_on_login_page(String userName) throws Throwable {
		System.out.println("STEP - User name : " + userName);
	}

	@When("^user enter password as \"([^\"]*)\" on login page$")
	public void user_enter_password_as_on_login_page(String arg1) throws Throwable {
		System.out.println("STEP - Password : " + arg1);
	}

}
