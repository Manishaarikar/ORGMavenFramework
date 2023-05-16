package stepDefination;

import base.PredefinedActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps {
	
	@Given("^user lanch browser and load url$")
	public void user_lanch_browser_and_load_url() throws Throwable {
		PredefinedActions.start();
	}

	@When("^user enter username as \"([^\"]*)\" login page$")
	public void user_enter_username_as_login_page(String userName) throws Throwable {
		LoginPage loginPage = LoginPage.getObject();
		loginPage.enterUsername(userName);
	}

	@When("^user enter password as \"([^\"]*)\" login page$")
	public void user_enter_password_as_login_page(String password) throws Throwable {
		LoginPage loginPage = LoginPage.getObject();
		loginPage.enterPassword(password);
	}
	
	@When("^user click on login button on login page$")
	public void user_click_on_login_button_on_login_page() throws Throwable {
		LoginPage loginPage = LoginPage.getObject();
		loginPage.clickOnLoginButton();
	}
	
	    @When("^User click on user dropdown$")
	    public void user_click_on_user_dropdown() throws Throwable {
	    	DashboardPage dashboardpage = DashboardPage.getObject();
	    	dashboardpage.logOutFromApp();
	    }
	    
	    @And("^User clicks on LogOut link$")
	    public void user_clicks_on_logout_link() throws Throwable {
	    	DashboardPage dashboardpage = DashboardPage.getObject();
	    	dashboardpage.logOut();
	    }

	    @SuppressWarnings("deprecation")
		@Then("^verify that user able to logged out$")
	    public void verify_that_user_able_to_logged_out() throws Throwable {
	    	//title[text()='OrangeHRM']
	    	DashboardPage dashboardpage = DashboardPage.getObject();
	    	Assert.assertEquals("OrangeHRM", dashboardpage.verifyLogOut() );
	        
	    }

}
