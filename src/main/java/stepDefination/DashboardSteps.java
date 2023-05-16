package stepDefination;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import pages.DashboardPage;

public class DashboardSteps {

	@Then("^user should navigate to dashboard page$")
	public void user_should_navigate_to_dashboard_page() throws Throwable {
		DashboardPage dashboardpage = DashboardPage.getObject();
		String dashBoardPagetitle = dashboardpage.getPageTitle();
		Assert.assertEquals("Dashboard", dashBoardPagetitle);
	}

	@Then("^user should see \"([^\"]*)\" widget list on dashboard$")
	public void user_should_see_widget_list_on_dashboard(String widgetCount) throws Throwable {
		DashboardPage dashboardpage = DashboardPage.getObject();
		int actualCount = dashboardpage.getAllWidgetsText().size();
		Assert.assertEquals(Integer.parseInt(widgetCount), actualCount);
	}

}
