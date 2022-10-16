package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetBrowserDriver {
	static WebDriver driver;
	
	public static WebDriver getBrowserDriver(String browser) {
		if(browser!=null) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = setChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver = setFirefoxDriver();
				
			}
		}return driver;
	}
	
	private static WebDriver setChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}
	
	
	private static WebDriver setFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		return driver;
	}

}
