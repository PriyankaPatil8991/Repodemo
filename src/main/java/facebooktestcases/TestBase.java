package facebooktestcases;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestBase {
		public static WebDriver driver=null;
		@BeforeSuite
		public void initialize() {
			//System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");		
		}
	//	@AfterSuite
		//public void tearDowntest() {
			//TestBase.driver.quit();
			
		//}

	}





