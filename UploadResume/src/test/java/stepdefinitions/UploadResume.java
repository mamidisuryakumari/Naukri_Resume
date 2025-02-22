package stepdefinitions;

import java.awt.Window;
import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NaukriPage;
import utilities.CommonUtils;
import utilities.Elements;

public class UploadResume {
	
	WebDriver driver = Hooks.getDriver();
	NaukriPage naukriPage = new NaukriPage(driver);
	
	@Given("I am on the naukri page")
	public void i_am_on_the_naukri_page() throws IOException {
	   driver.get(CommonUtils.getProperties().getProperty("baseUrl"));
	}

	@When("I login with below details")
	public void i_login_with_below_details() {
	    naukriPage.loginToNaukri("sandhya.qa2018@gmail.com", "70133@31606");
	
	}

	@When("user should be navigated to homepage")
	public void user_should_be_navigated_to_homepage() {
		
		System.out.println("I am on Naukri home page");
	    
	}
	@When("I update the naukri profile")
	public void update_Naukri_profile() throws InterruptedException {
		
		naukriPage.updateNaukriProfile(naukriPage.dummyText, naukriPage.headLine);
	    
	}

	@When("profile saved successfully")
	public void profile_saved_successfully() {
		
		System.out.println("Profile saved successfully");
	  
	}


}
