package bbbb.com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass2 {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) throws InterruptedException {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhivy\\eclipse-workspace\\com.automation\\Driver\\chromedriver.exe");
				 driver = new ChromeDriver();
				
			}else if (browsername.equalsIgnoreCase("ie")) {
				
				System.setProperty("webdriver.ie.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
				
			}else {
				System.out.println("invalid browser name");
			}
			driver.manage().window().maximize();
			Thread.sleep(4000);
			return driver;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return driver;
		
	}
	public static void getUrl(String value) {
		driver.get(value);

	}
	
	public static void inputToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
