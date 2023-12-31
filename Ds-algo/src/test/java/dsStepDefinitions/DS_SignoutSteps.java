package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.DS_HomePage;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DS_SignoutSteps {
	DS_DataStructureSteps dataStructureSteps = new DS_DataStructureSteps();
	WebDriver driver = dataStructureSteps.getDriver();
	DS_HomePage homePage = new DS_HomePage(driver);

	@When("User clicks on signout link")
	public void user_clicks_on_signout_link() {
		homePage.clickOnSingoutLink();
	}

	@Then("User should logout successfully")
	public void user_should_logout_successfully() {
		Assert.assertTrue(homePage.logOutMessage());
	}
}
