package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helper.FileReaderManager;

import bbbb.com.automation.BaseClass;
import bbbb.com.automation.BaseClass2;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\automation", glue="stepDefinition", monochrome=true)
public class RunnerClass {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws InterruptedException, IOException {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver=BaseClass2.getBrowser(browser);
		//driver.get("http://automationpractice.com/index.php");
	}
	/*@AfterClass
	public static void tearDown() {
		driver.close();

	}*/

}
