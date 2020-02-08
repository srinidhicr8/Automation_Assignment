package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;
import pompages.ClubPage;
import pompages.HomePage;
import pompages.ReviewPage;

public class TripAdvisor extends BaseTest {
	@Test
	public void validTest() {
		HomePage hp=new HomePage(driver);
		ClubPage cp =new ClubPage(driver);
		ReviewPage rp= new ReviewPage(driver);
		
		hp.srchtext();
		driver.switchTo().activeElement().sendKeys("Club Mahindra");
		hp.clubMahindra();
		
		driver.navigate().refresh();
		cp.writeReview();
		
		for (String winHandle : driver.getWindowHandles()) { 
	           driver.switchTo().window(winHandle);               
	    }
	     rp.bubble();
	     
	     String rev="my review on club mahindra madikeri";
		 rp.setRevTitle(rev);
		 
		 String revtxt="kjjnskdgndk ndkfngkdfnk sdfgnkdfngkdngkdn gkerngleg rnkrengsenglk earnglernglkr englnegnaregk jgerghan vrgvneng n  r regenrgh sj j  jaoiwj w qiwjqwtj jajweiqjwwu  wiejqwjrwjrjwj fwqirq3rqwjrf  efoiaejoqwjqwheri3h";
		 rp.setRevText(revtxt);
		 
		 WebElement hotelratings = driver.findElement(By.xpath("//div[.='Hotel Ratings']"));
		 if(hotelratings.isDisplayed()) {
				rp.hotelrating();
		}
		 rp.checkbox();
		 
		 
	}

}
