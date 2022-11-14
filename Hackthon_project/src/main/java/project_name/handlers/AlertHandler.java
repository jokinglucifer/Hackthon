package project_name.handlers;

import org.openqa.selenium.WebDriver;

public class AlertHandler {
	
	/**
	 * accepting alert
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * dismissing alert
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param driver
	 * @param text
	 */
	public void sendDataToAlert(WebDriver driver, String text) {
		try {
			driver.switchTo().alert().sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param driver
	 * @return
	 */
	public String getAlertText(WebDriver driver) {
		String s = null;
		try {
			s = driver.switchTo().alert().getText();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}


}
