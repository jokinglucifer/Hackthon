package project_name.handlers;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	 * 
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {
		element.click();
	}
	
	public void scrollDown(WebDriver driver) { 
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	}
	public void mouseHover(WebElement element, WebDriver driver) {
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(element).perform();
	}

	/**
	 * send text to web element
	 * 
	 * @param element
	 * @param text
	 */
	public void sendTextToWebElement(WebElement element, String text) {

			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
	
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
	
	
}
