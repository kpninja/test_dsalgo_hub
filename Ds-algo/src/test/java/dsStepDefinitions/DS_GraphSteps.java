package dsStepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.DS_GraphPage;
import Pages.DS_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DS_GraphSteps {
	DS_DataStructureSteps dataStructureSteps = new DS_DataStructureSteps();
	WebDriver driver = dataStructureSteps.getDriver();
	DS_HomePage homePage=new DS_HomePage(driver);
	DS_GraphPage graphPage=new DS_GraphPage(driver);
	
	@Given("User navigates to Graph page using dropdown Data Structure menu")
	public void user_navigates_to_graph_page_using_dropdown_data_structure_menu() {
		homePage.clickOnDataStructuredropdown();
		homePage.clickOnGraphLink();
	}

	@When("User navigates to tryEditor page by clicking Graph")
	public void user_navigates_to_try_editor_page_by_clicking_graph() {
		graphPage.clickOnGraphelement();
		graphPage.clickOnTryhere();
		
	    	}

	@When("User navigates to tryEditor page by clicking GraphRepresentations link")
	public void user_navigates_to_try_editor_page_by_clicking_graph_representations_link() {
		graphPage.clickOnGraphRepresentations();
		graphPage.clickOnTryhere();
	    	}



}
