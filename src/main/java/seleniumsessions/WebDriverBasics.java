package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	// automatio steps + verification point = automation testing
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("wrong title");
		}
		String url = driver.getCurrentUrl();
		if (url.contains("google")) {
			System.out.println("the url is correct");
		} else {
			System.out.println("wrong url");
		}
		driver.quit();
	}
}
