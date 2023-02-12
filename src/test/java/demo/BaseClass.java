package demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void start() {
		
		try {
			BrowserFactory.start(driver, "Chrome", "https://mvnrepository.com/search?q=WebDriver+manager");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaaaaaaaaa");
	}
	@AfterClass
	public void teardown() {
		
		BrowserFactory.quitBrowser(driver);
		System.out.println("zzzzzzzzzz");
	}
}
