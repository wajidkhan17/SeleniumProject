package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String prName = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(prName);
//		By productHeader = (By.tagName("h1"));
//		By term = By.linkText("Terms & Conditions");
		By firstNameLabel = By.xpath("//*[@id=\"account\"]/div[2]/label");
		ElementUtil eu = new ElementUtil(driver);
//		String actPrName = eu.doElementgetText(productHeader);
//		if (actPrName.equals("MacBook")) {
//			System.err.println("Product name is correct.. Pass");
//		} else {
//			System.err.println("Product name is Wrong.. Fail");
//		}
//		System.out.println(eu.doElementgetText(term));
		System.out.println(eu.doElementgetText(firstNameLabel));
	}
}
