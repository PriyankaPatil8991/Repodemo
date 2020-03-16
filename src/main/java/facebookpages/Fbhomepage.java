package facebookpages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Fbhomepage extends Fbloginpage {

	@FindBy(how = How.XPATH, using = "//div[@class='_6qfu _5lxt f_click']")
	static WebElement ProfileDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"js_45\"]/div/div/ul/li[1]/a/span/span")
	static WebElement logout;

	public void clickOnProfileDropdown() {
		ProfileDropdown.click();
	}
	public void clickOnlogout() {
		logout.click();
	}

}
