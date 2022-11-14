package project_name.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {
	
	
	@BeforeTest (alwaysRun =  true)
	public void beforeTest() {
		System.out.println("Before Test");

	}
	
	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("After Test");
	}


}
