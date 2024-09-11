package O2morny.O2morny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	WebDriver driver;
	PageBase(	WebDriver driver){
	  this.driver = driver; 
	// Call initElements() method by using PageFactory reference and pass driver and this as parameters. 
	    PageFactory.initElements( driver, this); 
	   } 
	
}
