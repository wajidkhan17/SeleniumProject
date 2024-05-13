package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleLinksElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
//		driver.findElement(By.linkText("MacBook")).click();
//		By macBookSelect = (By.linkText("MacBook"));
//		String macBook = "MacBook";
//		ElementUtil eu = new ElementUtil(driver);
////		eu.doClick(macBookSelect);
//		eu.doClick("linktext", macBook);
		driver.findElement(By.partialLinkText("Sales")).click();
	}
}
