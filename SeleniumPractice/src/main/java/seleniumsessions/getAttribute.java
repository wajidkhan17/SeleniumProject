package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstNameAttr = By.id("input-firstname");
		ElementUtil eu = new ElementUtil(driver);
		System.out.println(eu.doElementgetAttribute(firstNameAttr, "placeholder"));
	}
}
