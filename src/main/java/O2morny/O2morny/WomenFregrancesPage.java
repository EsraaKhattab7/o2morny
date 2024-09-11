package O2morny.O2morny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenFregrancesPage extends PageBase{

	public WomenFregrancesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="product-price")
	public WebElement Price;
	//*[@id="collection-products"]/div[2]/div/div[2]/div[2]/div[2]
	
	@FindBy(xpath="//*[@id=\"add-to-cart-2765896122468-template--15134922735710__main\"]")
	 WebElement Add_to_Cart;
	
	public void AddProducts()
	{
		String text=Price.getText();
	//double ProductPrice=Double.parseDouble(text); // returns Double object
     String newt=text.replace(".00 ", "");
 	System.out.println(newt);
	Integer i =Integer.parseInt(newt); 
	System.out.println(i);

	if (i<=2500)
	{
		Add_to_Cart.click();
	}
 }

}
