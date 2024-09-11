package O2morny.O2morny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	private WebDriver driver;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

		
	}

}
