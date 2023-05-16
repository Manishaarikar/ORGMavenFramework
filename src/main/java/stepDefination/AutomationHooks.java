package stepDefination;

import base.PredefinedActions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AutomationHooks {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Tags : " + scenario.getSourceTagNames());
		System.out.println("Scenario Name : " + scenario.getName());
		PredefinedActions.start();
	}

	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] ss =PredefinedActions.captureScreenshot(scenario.getName());
			scenario.embed(ss, "image/png");
		}
		//PredefinedActions.closeBrowser();
	}

}
