package project_name.bowser_setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static WebDriver driver;

	/**
	 * 
	 * @param url
	 */
	public void launchapp(String url) {
		driver.get(url);
	}

	public void setBrowser(String browserName) {
		switch (browserName) {
		case "chrome": {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		case "edge": {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value;" + browserName);
		}
	}

	/**
	 * 
	 * @param driver
	 */
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * 
	 * @param driver
	 */
	public void closeCurrentBrowserWindow(WebDriver driver) {
		driver.close();
	}
}
