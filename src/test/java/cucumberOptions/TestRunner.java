package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",
		monochrome=true,
		strict=true,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber/cucumber.json","junit:target/cucumber/cucumber.xml"})
public class TestRunner {


}
