package O2morny.O2morny;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HomePageTest extends TestBase {
	
	//
	
	HomePage HomePageObject;
	WomenFregrancesPage WomenFregrancesPageObject;
	
	
  @Test
  public void SelectFregrance() {
	  HomePageObject=new HomePage(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  HomePageObject.Navigate_To_Women_Fragrances();
	  Assert.assertEquals("Women Fragrances", HomePageObject.WomenFragrancesPage.getText());

  }
 @Test
 public void getPrice()
 {
	 WomenFregrancesPageObject=new WomenFregrancesPage(driver);
	 WomenFregrancesPageObject.AddProducts();
	
}
}