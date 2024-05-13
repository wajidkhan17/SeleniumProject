package testNg;

import org.testng.annotations.Test;

public class TestFeatures {
	
	@Test 
	public void login() {
		System.out.println("login");
	}
	@Test (dependsOnMethods = "login")
	public void HomePageTest() {
		System.out.println("HomePage");
	}
}
