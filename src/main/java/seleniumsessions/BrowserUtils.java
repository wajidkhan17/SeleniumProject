package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {
	private WebDriver driver;

	/**
	 * This method is use initilize the driver on the basis of give browser name
	 * 
	 * @param browser
	 * @return this returns the driver
	 */
	public WebDriver initDriver(String browser) {
//		System.out.println("the broweser name is: " + browser);
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.equalsIgnoreCase("safari")) {
//			driver = new SafariDriver();
//		} else {
//			System.out.println("Please launch the correct broeser" + browser);
//		}
//		return driver;
		switch (browser) {
		case "chrome":
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				break;
			}
		case "firefox":
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				break;
			}
		case "safari":
			if (browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
				break;
			}
		default:
			System.out.println("Please launch the correct broeser" + browser);
		}
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url is null");
			return;
		}
		if (url.indexOf("https") == -1) {
			System.out.println("url is invalid");
		}
		driver.get(url);
	}

	public String getPageTitle(String pageTitle) {
		String title = driver.getTitle();
		if(title.contains(pageTitle)) {
			System.out.println("The page tite is correct:" +title);
		} else {
			System.out.println("The page title is wrong");
		}
		return title;
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("the page url is :" + url);
		return url;
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
