package project_name.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	public void getText(String path) {
		WebElement txt = driver.findElement(By.xpath(path));
		System.out.println(txt.getText());
		
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
		Thread.sleep(1000);
	}
	public void selectLocation(String text) throws InterruptedException {
		WebElement city = driver.findElement(By.cssSelector(text));
		commonmethods.clickOnWebElement(city);
		Thread.sleep(1000);
	}
	
	public void selectPrice(String text) throws InterruptedException {
		WebElement price = driver.findElement(By.cssSelector(text));
		commonmethods.clickOnWebElement(price);
		Thread.sleep(1000);
	}
	
	public void selectModel(String text) throws InterruptedException {
		WebElement model = driver.findElement(By.id(text));
		commonmethods.clickOnWebElement(model);
		Thread.sleep(1000);
	}
	public void sortUsedCars(int i) {
		WebElement ddown =driver.findElement(By.id("websortbyusedcar"));
		Select select = new Select(ddown);
		select.selectByIndex(i);
	}
	/**
	 * 
	 * @param text
	 * @throws InterruptedException
	 */
	public void extractPopularModel(String text) throws InterruptedException {
		List<WebElement> items = driver.findElements(By.xpath(text));
		for(WebElement e: items)
		{
		    System.out.print(e.getText());
		}
		Thread.sleep(2000);
	}
	public void selectMoreFilters(String text) {
		WebElement filters = driver.findElement(By.xpath(text));
		commonmethods.clickOnWebElement(filters);
	}
	public void resettingFilters(String text) throws InterruptedException {
		WebElement reset = driver.findElement(By.xpath(text));
		commonmethods.clickOnWebElement(reset);
		Thread.sleep(2000);
	}
	public void listView(String text) throws InterruptedException {
		WebElement list = driver.findElement(By.xpath(text));
		commonmethods.clickOnWebElement(list);
		Thread.sleep(1000);
	}
	public void gridView(String text) throws InterruptedException {
		WebElement list = driver.findElement(By.cssSelector(text));
		commonmethods.clickOnWebElement(list);
		Thread.sleep(1000);
	}
	public void trustMark(String xpath) throws InterruptedException {
		WebElement trustmark = driver.findElement(By.xpath(xpath));
		commonmethods.clickOnWebElement(trustmark);
		Thread.sleep(1000);
	}
}
