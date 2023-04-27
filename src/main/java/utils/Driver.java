package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
	
	//ThreadLocal
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is : CHROME");
			driver.set(new ChromeDriver(getChromeOptions()));
			long chromeId =  Thread.currentThread().getId();
			Log.info("Chrome =--> Thread.id = " + chromeId);
			return driver.get();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			Log.info("Browser parameter is : FIREFOX");
			driver.set(new FirefoxDriver(getFirefoxOptions()));
			long firfoxID =  Thread.currentThread().getId();
			Log.info("Firefox =--> Thread.id = " + firfoxID);
			return driver.get();
			
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			Log.info("Browser parameter is : EDGE");
			driver.set(new EdgeDriver(getEdgeOptions()));
			long edgeID =  Thread.currentThread().getId();
			Log.info("EDGE =--> Thread.id = " + edgeID);
			return driver.get();
			
		}
		return driver.get();
		
	}
		
	public static FirefoxOptions getFirefoxOptions() {
		FirefoxBinary firefoxBinary =  new FirefoxBinary();
		//firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions =  new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		firefoxOptions.addArguments("--headless");
		
		return firefoxOptions;
	}
	
	public static ChromeOptions getChromeOptions() {
		ChromeOptions chromeOPtions =  new ChromeOptions();
		chromeOPtions.addArguments("--headless");
		chromeOPtions.addArguments("--window-size=1580, 1280");
		//chromeOPtions.addArguments("start-maximized");
		
		return chromeOPtions;
	}

	public static EdgeOptions getEdgeOptions() {
		EdgeOptions edgeOPtions =  new EdgeOptions();
		//edgeOPtions.addArguments("--headless");
		
		return edgeOPtions;
	}
	
}
