package project_name.bowser_setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * Base browser setup for 3 browsers : Chrome , Firefox and Edge
 * 
 * @author Suravi
 *
 */
public class BrowserSetup {

	/**
	 * fetch browser name
	 * 
	 * @param browserName
	 * @return
	 */
	public static WebDriver getDriver(String browserName, int implicitWait) {

		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browserName);
		}

		// maximize the window to device screen size
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));

		return driver;
	}

}
