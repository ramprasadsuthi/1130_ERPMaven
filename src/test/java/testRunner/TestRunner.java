package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Features//login.feature",
		glue={"stepDefinition"},
	//	dryRun=false,
	//	tags=("@regressionTest, @smokeTest"),
		plugin = { "pretty", "html:target/cucumber-reports.html"},
		publish = true,
		monochrome = true)

public class TestRunner {
	
}
