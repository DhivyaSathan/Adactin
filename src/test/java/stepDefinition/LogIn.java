package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.helper.FileReaderManager;
import com.runner.RunnerClass;

import bbbb.com.automation.BaseClass2;
import cucumber.api.java.en.*;
import pom.LogInPom;

public class LogIn extends BaseClass2 {
	public static WebDriver driver=RunnerClass.driver;
	LogInPom lip = new LogInPom(driver);
	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
	    //getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    //driver.get("http:automationpractice.com/index.php?controller=authentication&back=my-account");
		//getUrl("http:automationpractice.com/index.php?controller=authentication&back=my-account");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);
	}

	@When("^user enter valid userame \"([^\"]*)\" as username$")
	public void user_enter_valid_userame_as_username(String arg1) throws Throwable {
	    
	    inputToElement(lip.getEmail(), arg1);
	}

	@When("^user enter valid password \"([^\"]*)\" as password$")
	public void user_enter_valid_password_as_password(String arg1) throws Throwable {
	    
	    inputToElement(lip.getPassword(), arg1);
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	    clickOnElement(lip.getSubmit());
	    
	}
	@Then("^application goes to the home page$")
	public void application_goes_to_the_home_page() throws Throwable {
	   
	}
}
