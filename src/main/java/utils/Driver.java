package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	//ThreadLocal
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is : CHROME");
			driver.set(new ChromeDriver());
			long chromeId =  Thread.currentThread().getId();
			Log.info("Chrome =--> Thread.id = " + chromeId);
			return driver.get();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			Log.info("Browser parameter is : FIREFOX");
			driver.set(new FirefoxDriver());
			long firfoxID =  Thread.currentThread().getId();
			Log.info("Firefox =--> Thread.id = " + firfoxID);
			return driver.get();
			
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			Log.info("Browser parameter is : EDGE");
			driver.set(new EdgeDriver());
			long edgeID =  Thread.currentThread().getId();
			Log.info("EDGE =--> Thread.id = " + edgeID);
			return driver.get();
			
		}
		return driver.get();
		
	}

}
