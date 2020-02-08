package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[@title='Search']")
	private WebElement srchtb;
	
	@FindBy(css="[class='resultContainer local']>li:first-child")
	private WebElement clubMahiTb;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void srchtext() {
		srchtb.click();
	}
	public void clubMahindra() {
		clubMahiTb.click();
	}
}
