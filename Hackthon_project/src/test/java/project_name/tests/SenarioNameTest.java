package project_name.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_name.bowser_setup.BrowserSetup;
import project_name.handlers.CommonMethods;
import project_name.pages.HomePage;
import project_name.readers.PropertiesReader;

public class SenarioNameTest {

	PropertiesReader propertiesReader;
	CommonMethods commonMethods;
	HomePage homePage;
	WebDriver driver;

	@BeforeMethod
	public void initialize() {
		propertiesReader = new PropertiesReader();
		commonMethods = new CommonMethods();

		driver = BrowserSetup.getDriver(propertiesReader.getBrowserName(),
				propertiesReader.getImplicitWait());
		homePage = new HomePage(driver);
		commonMethods.launchApplication(driver, propertiesReader.getURL());

	}

	@Test
	public void TestCaseName1() {
		homePage.openSignInPopUp();
		

	}

	@Test
	public void TestCaseName2() {
		homePage.openSignInPopUp();

	}

	@Test
	public void TestCaseName3() {
		homePage.openSignInPopUp();
		int i = 10 / 0;
		System.out.println(i);

	}
	
	@AfterMethod
	public void teardown() {
		commonMethods.quitBrowser(driver);
	}

}
