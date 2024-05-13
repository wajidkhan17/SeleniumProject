package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	// Preconditions
	@BeforeSuite
	public void setup() {
		System.out.println("system property");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("login method");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter url");
	}

	// test cases
	@Test
	public void SearchTest() {
		System.out.println("SearchTest");
	}
	
	@Test
	public void SearchTest2() {
		System.out.println("SearchTest2");
	}
	
	@Test
	public void SearchTest3() {
		System.out.println("SearchTest3");
	}
	// post conditions

	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
		System.out.println("--------------------");
	}

	@AfterClass
	public void drleteCookies() {
		System.out.println("Delete cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close browser");
	}

//	@AfterSuite
//	public void generateReport() {
//		System.out.println("generate report");
//	}
}
