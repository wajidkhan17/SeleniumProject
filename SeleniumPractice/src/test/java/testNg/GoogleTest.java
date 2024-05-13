package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	//This is the basic testng class with the annotation examples
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	//@Test notation examples
	@Test(groups = "Title")
	public void googleTitle() {
		String str = driver.getTitle();
		System.out.println(str);
	}

	@Test(groups = "Logo")
	public void googleLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(status);
	}

	@Test(groups = "link test")
	public void mailLink() {
		boolean status = driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).isDisplayed();
		System.out.println(status);
	}

	@Test(groups = "test")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = "test")
	public void test2() {
		System.out.println("test3");
	}

	@Test(groups = "test")
	public void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
