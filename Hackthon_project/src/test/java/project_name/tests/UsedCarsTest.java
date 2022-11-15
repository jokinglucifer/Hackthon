package project_name.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_name.pages.UsedCars;
public class UsedCarsTest extends UsedCars {

	
	@BeforeMethod
	public void beforeMethodTest() {
		setupWebsite("firefox");
	}

	@Test (priority=1)
	public void navigateUsedCars() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		WebElement fc =driver.findElement(By.xpath("//a[normalize-space()='Used Cars']"));
		System.out.println(fc.getText());
	}
	
	
	@Test (priority=2)
	public void selectCitydelhi() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='delhi']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='delhi']"));
		String c=dh.getText();
		System.out.println(c);
		Thread.sleep(2000);
		}
	@Test (priority=3)
	public void selectCityBanglore() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Bangalore']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='Bangalore']"));
		String c=dh.getText();
		System.out.println(c);
		Thread.sleep(2000);
		}
	
	@Test (priority=4)
	public void selectCityChennai() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='Chennai']"));
		String c=dh.getText();
		System.out.println(c);
		Thread.sleep(2000);
		}

	@AfterMethod
	public void aftertest() {
		quitBrowser(driver);
	}
}
