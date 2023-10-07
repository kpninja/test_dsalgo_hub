package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.DS_HomePage;
import Pages.DS_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DS_RegisterSteps {
	DS_GetStartedSteps getStartedSteps = new DS_GetStartedSteps();
	WebDriver driver = getStartedSteps.getDriver();
	

	@When("User click on Register link")
	public void user_click_on_register_link() 
	{
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnRegisterLink();

	    	}

	@When("User enters required fields and click on Register button")
	public void user_enters_required_fields_and_click_on_register_button() {
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOnRegisterLink();

	    }

	@Then("User should login to their account")
	public void user_should_login_to_their_account() {
		DS_RegisterPage registerPage = new DS_RegisterPage(driver);
		registerPage.register();

	    }
public WebDriver getDriver(){
		return driver;
	}




	}


