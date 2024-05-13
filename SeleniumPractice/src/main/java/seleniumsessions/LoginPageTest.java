package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	public static void main(String[] args) {
		BrowserUtils brutil = new BrowserUtils();
		WebDriver driver = brutil.initDriver("chrome");
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brutil.getPageTitle("Account");
		ElementUtil eu = new ElementUtil(driver);
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		eu.doSendKeys(emailId, "naveen@gmail.com");
		eu.doSendKeys(password, "test@123");
		brutil.quitBrowser();
	}
}
