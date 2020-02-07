package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_KHome {
	
	@FindBy(name="q")
	private WebElement fliphome;
	
	@FindBy(xpath="//button[.='✕']")
	private WebElement popup;
	
	@FindBy(xpath="//button[@type='submit']")
    private WebElement srchbutn;
	
	public F_KHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTextbox(String str) {
		fliphome.sendKeys(str);
	}
	public void Pop() {
		popup.click();
	}
	public void setSrchBut() {
		srchbutn.click();
	}
}
