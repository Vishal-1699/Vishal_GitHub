package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainpagejava.BaseClass;
import mainpagejava.LoginPage;
import mainpagejava.PimPage;

public class BaseTest extends BaseClass{
	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void PageObjects() {
		loginPage = new LoginPage(driver);
		pimPage = new PimPage(driver);
	}
	
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
