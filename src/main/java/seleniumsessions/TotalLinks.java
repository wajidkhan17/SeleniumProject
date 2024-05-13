package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// 1. Total find the links on the page
		// 2. print the next of each link on the console
		// 3. Print only those links which are having text
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		By links = By.tagName("a");
		ElementUtil eu = new ElementUtil(driver);
		System.out.println(eu.getPageLinksCount(links));
		List<String> linkTextList = eu.getElementsTextList(links);
		System.out.println(linkTextList);
	}
//		System.out.println("Total links: " + linkList.int());
//		for (int i = 0; i < linkList.size(); i++) {
//			String text = linkList.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(i + " : " + text);
}
