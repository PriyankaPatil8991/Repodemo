package facebooktest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import facebookpages.Fbhomepage;
import facebookpages.Fbloginpage;

public class Testcase extends TestBase {
	@Test
	public void testCase() throws InterruptedException {
		PageFactory.initElements(TestBase.driver, Fbloginpage.class);
		Thread.sleep(3000);
		Fbloginpage.setEmail("piyupatil5029@gmail.com");
		Fbloginpage.setPassword("adityapatil");
		Fbloginpage.clickOnLoginButton();
	//	Fbloginpage.alertAccept();
			/* Fbhomepage homepage=PageFactory.initElements(driver, Fbhomepage.class);
		 Thread.sleep(4000);
		 homepage.clickOnProfileDropdown();
		 Thread.sleep(4000);
		 homepage.clickOnlogout();
		 */
	}
}
