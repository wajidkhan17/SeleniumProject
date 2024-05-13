package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@gmail.com");
//		By emailId = By.name("email");
//		By password = By.name("password");
//		
//		String email = "email";
//		String passwrd = "password";
//		
		ElementUtil eu = new ElementUtil(driver);
//		eu.doSendKeys(emailId, "test@gmail.com");
//		eu.doSendKeys("name", passwrd, "test@123");
		// class name: use only when it is unique
//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		// 4. Xpath: Its not an attribute, its address of the element in html dom
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		// By pattern
//		By clickButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		// String pattern
//		String email_id = "//*[@id=\"input-email\"]";
//		String passwod = "//*[@id=\"input-password\"]";
//		String clikBut = "//*[@id=\"content\"]/div/div[2]/div/form/input";
//		// script
//		eu.doSendKeys(email, "test@gmail.com");
//		eu.doSendKeys("xpath", passwod, "test@123");
//		// eu.doClick(clickButton);
//		eu.doClick("xpath", clikBut);
		
		//5. css selector: is not an attribute
	//	driver.findElement(By.cssSelector("#Form_getForm_Name")).sendKeys("wajid");
		
//		By firstname =  By.cssSelector("#Form_getForm_Name");
//		String firstName = "#Form_getForm_Name";
//		
//		eu.doSendKeys("css", firstName, "Wajid");
		
		//partial link text
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
