package project_name.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	@Test(priority = 1)
	public void navigateUsedCars() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		WebElement fc = driver.findElement(By.xpath("//a[normalize-space()='Used Cars']"));
		System.out.println(fc.getText());
	}

	@Test(priority = 2)
	public void selectCitydelhi() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='delhi']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='delhi']"));
		String c = dh.getText();
		System.out.println(c);
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void selectCityBanglore() throws Exception {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Bangalore']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='Bangalore']"));
		String c = dh.getText();
		System.out.println(c);
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void selectCityChennai() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		WebElement dh = driver.findElement(By.cssSelector("a[title='Chennai']"));
		String c = dh.getText();
		System.out.println(c);
	}

	@Test(priority = 5)
	public void carsUnder2Lakhs() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		selectPrice("#price1");
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());
	}

	@Test(priority = 6)
	public void carsUnder5Lakhs() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		selectPrice("#price2");
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());
	}

	@Test(priority = 7)
	public void carsUnder10Lakhs() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		selectPrice("#price3");
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());
	}

	@Test(priority = 8)
	public void hyundaiI10Cars() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(3000);
		selectModel("bycarid10_146");
		Thread.sleep(1000);
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());

	}

	@Test(priority = 9)
	public void marutiSwiftCars() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		selectModel("bycarid22_338");
		Thread.sleep(1000);
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());

	}

	@Test(priority = 9)
	public void maruti800Cars() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		selectModel("bycarid22_317");
		Thread.sleep(1000);
		WebElement title = driver.findElement(By.cssSelector("#usedcarttlID"));
		System.out.println(title.getText());
	}

	@Test(priority = 10)
	public void popularModelsList() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
		Thread.sleep(2000);
		extractPopularModel("//div[@class='gsc_thin_scroll']");
	}

	/**
	 * @Test (priority = 11) public void selectingMoreFilters() throws
	 *       InterruptedException { findUsedCars("//a[normalize-space()='Used
	 *       Cars']"); Thread.sleep(1000); selectLocation("a[title='Chennai']");
	 *       ((JavascriptExecutor) driver).executeScript("scroll(0,900)");
	 *       Thread.sleep(3000); driver.findElement(By.xpath("//span[@class='uFm
	 *       text-center zw-cmn-cursorPointer']")).click();
	 *       selectMoreFilters("//span[@class='uFm text-center
	 *       zw-cmn-cursorPointer']"); Thread.sleep(2000); }
	 **/

	@Test(priority = 11)
	public void resetFilter() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		selectPrice("#price3");
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
		Thread.sleep(1000);
		selectModel("bycarid22_338");
		((JavascriptExecutor) driver).executeScript("scroll(0,5)");
		resettingFilters("//a[normalize-space()='Reset All']");
	}
	@Test (priority=12)
	public void sortByRevelency() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		sortUsedCars(0);
		getText("//div[@id='data-set-body']");
		
	}
	@Test (priority=13)
	public void sortByRecency() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		sortUsedCars(1);
		System.out.println(driver.getTitle());
		
	}
	@Test (priority=14)
	public void sortByKmsDrivenLow_High() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		sortUsedCars(2);
		Thread.sleep(1000);
			
		System.out.println(driver.getTitle());
	}
	@Test (priority=15)
	public void displayInList() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		listView("//span[@class='list viewClick zw-sr-spirit zw-cmn-cursorPointer pull-left']");
	}
	@Test (priority=16)
	public void displayInGrid() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		selectLocation("a[title='Chennai']");
		listView("//span[@class='list viewClick zw-sr-spirit zw-cmn-cursorPointer pull-left']");
		gridView(".grid.viewClick.zw-sr-spirit.pull-left.mr-15.zw-cmn-cursorPointer");
	}
	
	@Test (priority=17)
	public void modelSeacrch() throws InterruptedException {
		findUsedCars("//a[normalize-space()='Used Cars']");
		Thread.sleep(1000);
		selectLocation("a[title='Chennai']");
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='trustmarkChk']")).click();
		trustMark("//input[@id='trustmarkChk']");
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("scroll(0,5)");
		getText("//li[@class='hcrossbtn']");
		
	}


	@AfterMethod
	public void aftertest() {
		quitBrowser(driver);
	}
}
