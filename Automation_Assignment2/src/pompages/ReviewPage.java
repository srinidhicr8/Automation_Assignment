package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	@FindBy(id="bubble_rating")
	private WebElement bubRat;
	
	@FindBy(id="ReviewTitle")
	private WebElement revtitle;

	@FindBy(id="ReviewText")
	private WebElement revtext;
	
	@FindBy(id="qid12_bubbles")
	private WebElement hotelrev;
	
	@FindBy(id="noFraud")
	private WebElement chkbox;
	
	
	public ReviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void bubble() {
		bubRat.click();
	}
	
	public void setRevTitle(String tit) {
		revtitle.sendKeys(tit);
	}
	public void setRevText(String text) {
		revtext.sendKeys(text);
	}
	public void hotelrating() {
		hotelrev.click();
	}
	public void checkbox() {
		chkbox.click();;
	}
}
