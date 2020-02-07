package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement srchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement srchbtn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSearchBox(String SB) {
		srchtb.sendKeys(SB);
	}
	
	public void searchbtn() {
		srchbtn.click();
	}
	
}
