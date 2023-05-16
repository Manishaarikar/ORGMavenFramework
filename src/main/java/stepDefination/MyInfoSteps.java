package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.MyInfoPage;

public class MyInfoSteps {
	 @Given("^User landing on dashboard page$")
	    public void user_landing_on_dashboard_page() throws Throwable {
		 DashboardPage dashboardpage = DashboardPage.getObject();
	      if(!dashboardpage.getPageTitle().equalsIgnoreCase("Dashboard"));
	    	  dashboardpage.navigateToDashboard();
	    }

	    @When("^User clicks on My Info link$")
	    public void user_clicks_on_my_info_link() throws Throwable {
	    	DashboardPage dashboardpage = DashboardPage.getObject();
	    	dashboardpage.clickOnMyInfo();
	    }

	    @Then("^Validate that user redirects to My Info Page$")
	    public void validate_that_user_redirects_to_my_info_page() throws Throwable {
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	Assert.assertEquals("My Info", myinfo.verifyTitle());
	       
	    }
	    
	    @And("^Validate profile pic$")
	    public void validate_profile_pic() throws Throwable {
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	Assert.assertTrue(myinfo.isProfileDisplayed());
	    }
	    
	    @And("^Validate the Employee Name$")
	    public void validate_the_employee_name_and_job_title() throws Throwable {
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	Assert.assertEquals("Jacqueline Wagner", myinfo.verifyEmployee());
	      }
	    
	    @And("^Validate Job Title$")
	    public void validate_job_title() throws Throwable {
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	Assert.assertEquals("CHRO", myinfo.verifyJobTitle());
	    }

	    @When("^User click on Job link$")
	    public void user_click_on_job_link() throws Throwable {
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	myinfo.viewJobDetails();
	        	    }

	   

	    @Then("^User should view employement details$")
	    public void user_should_view_employement_details() throws Throwable {
	    	
	    	MyInfoPage myinfo= MyInfoPage.getObject();
	    	Assert.assertEquals("Job", myinfo.viewJobDetails());
	    	
	       	    }
}
