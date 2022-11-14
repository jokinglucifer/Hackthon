package project_name.handlers;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_name.readers.PropertiesReader;

public class CommonMethods {
	
	WebDriverWait wait;
	PropertiesReader pr;
	
	public void launchApplication(WebDriver driver , String url) {
		driver.get(url);
		pr = new PropertiesReader();
		wait = new WebDriverWait(driver, Duration.ofSeconds(pr.getExplicitWait()));
	}

	/**
	 * clicking on a webelement
	 * 
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}

	/**
	 * send text to web element
	 * 
	 * @param element
	 * @param text
	 */
	public void sendTextToWebElement(WebElement element, String text) {

		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}

	/**
	 * clear existing text and send text to web element
	 * 
	 * @param element
	 * @param text
	 */
	public void clearAndSendTextToWebElement(WebElement element, String text) {

		try {
			element.isDisplayed();
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}
	
	/**
	 * Hard wait if implicit and explicit wait are not enough / just for execution check
	 */
	public void applyHardWait() {
		pr = new PropertiesReader();
		try {
			Thread.sleep(pr.getHardWait());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
