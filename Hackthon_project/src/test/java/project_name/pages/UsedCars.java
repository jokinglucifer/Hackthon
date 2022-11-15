package project_name.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import project_name.bowser_setup.BrowserSetup;
import project_name.handlers.CommonMethods;

public class UsedCars extends BrowserSetup{
	CommonMethods commonmethods = new CommonMethods();
	//To open zigwheels.com
	public void setupWebsite(String browser) {
		setBrowser(browser);
		launchapp("https://www.zigwheels.com/");
		driver.manage().window().maximize();
	}
	//Find Used Cars
	/**
	 * 
	 * @param text
	 * @throws InterruptedException
	 */
	public void findUsedCars(String text) throws InterruptedException {
		WebElement usedCars = driver.findElement(By.xpath(text));
		commonmethods.mouseHover(usedCars, driver);
		Thread.sleep(2000);
		commonmethods.clickOnWebElement(usedCars);
	}
	public void selectLocation(String text) throws InterruptedException {
		WebElement city = driver.findElement(By.cssSelector(text));
		commonmethods.clickOnWebElement(city);
		Thread.sleep(2000);
	}
	
	
}
