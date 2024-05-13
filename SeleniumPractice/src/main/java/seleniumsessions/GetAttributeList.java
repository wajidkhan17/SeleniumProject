package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// total links on the page and retur the href list
		driver.findElements(By.tagName("a"));
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		ElementUtil eu = new ElementUtil(driver);
		System.out.println(eu.getAttributeList(links, "href"));
		System.out.println(eu.getAttributeList(links, "height"));
	}
}
