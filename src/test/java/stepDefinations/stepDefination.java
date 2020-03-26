package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Automate.Example.Base;

@RunWith(Cucumber.class)
public class stepDefination {
	public static WebDriver driver;
	
    @Given("^user is on \"([^\"]*)\"$")
    public void user_is_on_something(String strArg1) throws Throwable {
    	driver = Base.getDriver(); 	
    	driver.get(strArg1);
	System.out.println("This is test code");
    }

    @When("^user refreshes the browser$")
    public void user_refreshes_the_browser() throws Throwable {
    	driver.navigate().refresh();
    }

    @Then("^user closes the browser$")
    public void user_closes_the_browser() throws Throwable {
    	Thread.sleep(5000);
    	driver.close();
    }
}
