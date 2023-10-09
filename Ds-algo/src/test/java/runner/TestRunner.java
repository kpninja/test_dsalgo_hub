package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\myhome\\git\\repository_dsalgo\\Ds-algo\\src\\test\\java\\features",
                  glue={"dsStepDefinitions","hooks"},
                  monochrome=true,
                  tags="@all",
                		  plugin= {"pretty",
                					"html:target/CucumberReports/CucumberReport.html",
                					"json:target/CucumberReports/CucumberReport.json",
                					"junit:target/CucumberReports/CucumberReport.xml",
                					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class TestRunner {

}
