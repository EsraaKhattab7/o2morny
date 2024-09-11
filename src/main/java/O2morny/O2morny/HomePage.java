package O2morny.O2morny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@FindBy(xpath="//*[@id=\"responsiveMenu\"]/li[1]/a")
	WebElement Fragrances ;
	
	@FindBy(linkText="Women Fragrances")
	WebElement WomenFragrances;
	
	@FindBy(xpath="/html/body/main/div[1]/section/div[1]/div/div/div/div/div/div/div/h1")
	public WebElement WomenFragrancesPage;
	
	public void Navigate_To_Women_Fragrances()
	{
		Fragrances.click();
		WomenFragrances.click();
		}

}
