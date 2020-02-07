package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FK_Iphone {

	@FindBy(xpath="//div[.='Apple iPhone XR (Yellow, 64 GB)']")
	private WebElement iphneXr;
	
	public FK_Iphone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setPhone() {
		iphneXr.click();
	}
}
