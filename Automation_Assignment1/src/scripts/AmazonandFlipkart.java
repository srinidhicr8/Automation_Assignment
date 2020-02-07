package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;
import pompages.FK_Iphone;
import pompages.F_KHome;
import pompages.Homepage;
import pompages.Iphone;


public class AmazonandFlipkart extends BaseTest {
	@Test
	public void validTest() {
		Homepage hp= new Homepage(driver);
		Iphone iphne =new Iphone(driver);
		F_KHome fk=new F_KHome(driver);
		FK_Iphone FKiphn=new FK_Iphone(driver);
		
		String srchbox ="iPhone XR (64GB) - Yellow";
		hp.setSearchBox(srchbox);
		hp.searchbtn();
		
		iphne.setMobBtn();
		
		for (String winHandle : driver.getWindowHandles()) { 
			 driver.switchTo().window(winHandle);               
		}
	     WebElement price = driver.findElement(By.id("priceblock_ourprice"));
	     String finalValue = price.getText().substring(1).replaceAll(",",""); 
		 float AmazonPrice = Float.parseFloat(finalValue);
         System.out.println("Price of the iphone in Amazon is : "+AmazonPrice);
	    
	     driver.navigate().to("https://www.flipkart.com");
         
	     String textbox="iPhone XR (64GB) - Yellow";
	     fk.setTextbox(textbox);
	     fk.Pop();
	     fk.setSrchBut();
	     FKiphn.setPhone();
		 
         for (String winHandle : driver.getWindowHandles()) { 
         driver.switchTo().window(winHandle);              
       }
         String mobprice = driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText();
         String finalprice2 = mobprice.substring(1).replaceAll(",", "");
         int flipkartPrice = Integer.parseInt(finalprice2);
         System.out.println("Price of the iphone in flipkart is : "+flipkartPrice);
         		 
          if(AmazonPrice < flipkartPrice)
         {
            System.out.println("Amazon website has lesser price for the iphone");
         }
         	else
         {
         	System.out.println("Flipkart website has lesser price for the iphone");
         }


	}

}
