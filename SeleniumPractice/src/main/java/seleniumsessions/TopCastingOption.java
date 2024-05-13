package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOption {
	public static void main(String[] args) {
		
		//Top casting 
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new SafariDriver();
		
		//2.
		//ChromeDriver d1 = new ChromeDriver();
		RemoteWebDriver d2 = new ChromeDriver();
		d2.get("https://www.google.com/");
	}
}
