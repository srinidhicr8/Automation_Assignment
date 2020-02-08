package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}
  @BeforeMethod
  public void setUp() {
	  //To open the browser
	  driver= new ChromeDriver();
	  //To enter the url
	  driver.get(Library.getPropertyValue("URL"));
	//maximize the window
	  driver.manage().window().maximize();
	  //to enter implicit time wait
	  String time = Library.getPropertyValue("IMPLICIT_WAIT");
	  driver.manage().timeouts().implicitlyWait(Long.parseLong(time), TimeUnit.SECONDS);
  }
  @AfterMethod
  public void close() {
	  
	  driver.quit();
  }
}
