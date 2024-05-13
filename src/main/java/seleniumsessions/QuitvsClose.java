package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart");
		String title = driver.getTitle();
		System.out.println(title);
	//	driver.quit();
		driver.close();
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
