package project_name.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_name.handlers.CommonMethods;

public class HomePage {
	
	CommonMethods commonMethods ;
	

	@FindBy(className = "logo")
	WebElement logo;

	@FindBy(className = "sign-in")
	WebElement signInButton;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void openSignInPopUp() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnWebElement(signInButton);
		commonMethods.applyHardWait();
		
	}

}
