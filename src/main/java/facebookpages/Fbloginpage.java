package facebookpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Fbloginpage  {
	// Using FindBy for locating elements
	@FindBy(how = How.CSS, using = "#email")
	static WebElement emailTextBox;
	@FindBy(how = How.CSS, using = "#pass")
	static WebElement setPassword;
	@FindBy(how = How.XPATH, using = "//input[@value='Log In']")
	static WebElement SigninButton;
	// Defining all user actions that can be performed in facebook home Page

	// This method is to set Email in email text box
	public static void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}
//This method is to set Password in password text Box
	public static void setPassword(String strPassword) {
		setPassword.sendKeys(strPassword);
	}
//This method is to click on login Button
	public static void clickOnLoginButton() {
		SigninButton.click();
	}
/*	public static void alertAccept() {
	Alert alert=facebooktestcases.TestBase.driver.switchTo().alert();
	alert.accept();
	}*/
}
