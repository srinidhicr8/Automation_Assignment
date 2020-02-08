package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClubPage {

	@FindBy(xpath="//a[.='Write a review']")
	private WebElement review;
	
	public ClubPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void writeReview() {
		review.click();
	}
}
