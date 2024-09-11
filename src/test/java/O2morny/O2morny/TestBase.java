package O2morny.O2morny;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	  @BeforeSuite
	  
	    public static void initDriver() {
	    		
	    			        
			//ChromeOptions options = new ChromeOptions();

	        // The following statement sets the argument to disable notification in chrome when executing the tests
	        driver = new ChromeDriver();
	        driver.get("https://www.o2morny.com/");
	        driver.manage().window().maximize();
	    }

	    
	    /**
	     * Suite level tear-down method to quit the WebDriver instance
	     */
	    @AfterSuite
	    public void quitDriver() {
	        driver.quit();
	    }
}