package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/java/features", 
		glue = "stepDefination", 
		tags = { "@CUCUMBER-1 , @Cucumber-2 , @Cucumber-3 , @Cucumber-4" }, // OR
		//tags = { "@CUCUMBER-1 , @Cucumber-2 , @Cucumber-3" },
	//	tags = { "@CUCUMBER-11 , @Cucumber-12" },
//		tags = { "@CUCUMBER-12345", "@smoke" }, //AND
		monochrome = true, 
		strict = true, 
		dryRun = false, 
		plugin = { 	
					"html:target/htmlReport/",
					"json:target/jsonReport/cucumberReport.json",
					"pretty"}
		)

public class TestRunner {

	
}
