package mainpagejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PimPage extends BaseClass {

	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement txtPage;

	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String titleOfPimPage() {
		return txtPage.getText();
	}
}
