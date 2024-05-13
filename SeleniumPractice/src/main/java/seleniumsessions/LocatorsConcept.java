package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//	
		//String locator
		String email_id = "input-email";
		String password = "input-password";
		
		doSendKeys("id", email_id, "test@gmail.com");
		doSendKeys("id", password, "test@123");
	}

	public static By getBy(String locatorType, String selector) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
		default:
			break;
		}
		return locator;
	}

	public static void doSendKeys(String locatorType,String selector, String value) {
		By locator =  getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
