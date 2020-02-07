package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iphone {

	@FindBy(xpath="//span[.='Apple iPhone XR (64GB) - Yellow']")
	private WebElement mobbuttn;
	
	public Iphone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setMobBtn() {
		mobbuttn.click();
	}
}
