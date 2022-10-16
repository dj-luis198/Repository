package base;

import java.time.Duration;
import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.GetBrowserDriver.getBrowserDriver;

//import utils.LogHelper;
import utils.PropertiesUtil;

public class Base {
	static Properties propApp=PropertiesUtil.loadApplicationProperties();
	static Properties propFrame=PropertiesUtil.loadFrameworkProperties();
	static Properties propUser=PropertiesUtil.loadUserProperties();
	


	public static WebDriver driver;
	public static void init() {
		String url= propApp.getProperty("url");
		String browser= propFrame.getProperty("browser");
		driver = getBrowserDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();	
	}
	
	
	//----------------------------findElement(s)---------------------//
	private static WebElement findElement(String locator) {
		String time= propFrame.getProperty("timeOut");
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(time)));
			return ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("El locator " + locator + " no fue encontrado");
		}
	}
	
	/*protected static List<WebElement> findElements(String locator) {
	 * int time= Integer.parseInt(propFrame.getProperty("timeOut"));
	try {
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return ewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(locator)));
	} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
		throw new Error("El locator " + locator + " no fue encontrado");
	}
}*/
	
	//-----------------------------basicos---------------------------//
	public static void click(String locator) {
		findElement(locator).click();
	}
	
	public static void quit() {
		driver.quit();
	}

}
