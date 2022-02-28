package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SmokeTest {

	WebDriver driver;
	@Given("Open firefox and start application")
	public void open_firefox_and_start_application() {
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demo.guru99.com/v4/index.php");
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("uid")).sendKeys("mgr123");
	   driver.findElement(By.name("password")).sendKeys("mgr!23");
		throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("btnLogin")).click();
		throw new io.cucumber.java.PendingException();
	}



	@Then("application should be closed")
	public void application_should_be_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
