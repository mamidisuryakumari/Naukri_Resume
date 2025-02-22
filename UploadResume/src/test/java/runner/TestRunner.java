 package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", 
                 glue = {"stepdefinitions", "hooks"},
                		 tags = "@uploadresume",
                 plugin = {"pretty", "html:target/cucumber-reports/reports.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 dryRun = false,
                 monochrome = true
)



public class TestRunner{
	
}
