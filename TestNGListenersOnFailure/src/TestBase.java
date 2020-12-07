import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	// Must be add Selenium Jars and TestNG Library for this class
	// Also add util.java, TestCinfig.java and monitoringMail.java this standard file for execution of program 
	public static WebDriver driver;
	
	@BeforeSuite
	public void Intialise()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			
		}// end if Block here
	}//  end Initilise () method here
	
	@AfterSuite
	public void closing()
	{
		if(driver!=null)
			driver.close();
	}// end closing () method here
	

}// end class here
