package seleniumsessions;


public class AmzonTest {
	public static void main(String[] args) {
		
		BrowserUtils bu = new BrowserUtils();
		bu.initDriver("firefox");
		bu.launchURL("https://www.amazon.in/");
		bu.getPageTitle("Amazon.in");
		bu.getPageUrl();
		bu.quitBrowser();
	}
}
