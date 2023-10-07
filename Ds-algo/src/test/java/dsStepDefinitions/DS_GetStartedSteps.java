package dsStepDefinitions;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;



import Pages.DS_HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_GetStartedSteps {
static WebDriver driver;
	
	public  WebDriver getDriver() {
		return driver;
	}
	
	@Given("The user enters DS Algo portal link")
	public void the_user_enters_ds_algo_portal_link() {
		LoggerLoad.info("User is on DS-ALGO website");
		driver = DriverFactory.getDriver();

	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		LoggerLoad.info("User clicks on GetStarted link");
		DS_HomePage homePage = new DS_HomePage(driver);
		homePage.clickOngetStarted();

	}

	@Then("The user should be redirected to home page")
	public void the_user_should_be_redirected_to_home_page() {
		LoggerLoad.info("User is on home page");
		DS_HomePage homePage = new DS_HomePage(driver);
		String title = homePage.getHomePageTitle();
		Assert.assertEquals(title, "NumpyNinja");
	}

}
