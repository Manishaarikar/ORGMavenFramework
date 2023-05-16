package stepDefination;

import java.util.List;
import org.junit.Assert;
import org.junit.runner.RunWith;
import base.PredefinedActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AssignLeavePage;
import pages.DashboardPage;

public class AssignLeaveSteps {
	
    
    @Given("^User is  on Dashboard Page$")
    public void user_is_on_dashboard_page() throws Throwable {
      
      DashboardPage dashboardpage = DashboardPage.getObject();
      if(!dashboardpage.getPageTitle().equalsIgnoreCase("Dashboard"));{
    	  dashboardpage.navigateToDashboard();
      }
    }
    
    @And("^user clicks on Assign Leave widget$")
    public void user_clicks_on_assign_leave_widget() throws Throwable {
    	DashboardPage dashboardpage = DashboardPage.getObject();
    	dashboardpage.clickOnAssignLeaveWidget();
    }
    
    @Then("^Verify that user is on Assign Leave Page$")
    public void verify_that_user_is_on_assign_leave_page() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	Assert.assertEquals("Assign Leave", assignleave.verifyTitle());
    }
     
    @When("^User enters/select Employee as \"([^\"]*)\"$")
    public void user_entersselect_employee_as_something(String employee) throws InterruptedException {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.enterEmployee(employee); 
    }
    
    @Then("^Validate that user able to select the Leave Type$")
    public void validate_that_user_able_to_select_the_leave_type() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.clickOnLeaveType();
    }
   
    @When("^user select Today from clender$")
    public void user_select_today_from_clender() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.selectDate();
    }
    
    @Then("^user should be able to write comment as \"([^\"]*)\"$")
    public void user_should_be_able_to_write_comment_as_something(String comment) throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.writeComment(comment);
    }



    @Then("^Validate that user able to submit leave by clicking on Assign$")
    public void validate_that_user_able_to_submit_leave_by_clicking_on_assign() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.clickOnAssign(); 
    }
    

    @When("^User clicks on check leave Balance link$")
    public void user_clicks_on_check_leave_balance_link() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.checkSickLeaveBalance();
    }


    @Then("^Validate that user able to see Available Sick Leave Balance$")
    public void validate_that_user_able_to_see_available_sick_leave_balance() throws Throwable {
    	AssignLeavePage assignleave = AssignLeavePage.getObject();
    	assignleave.validateLeaves();
    	//PredefinedActions.returnDriver().close();	
    }   
}