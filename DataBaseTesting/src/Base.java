
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//import DD_Google_TestUtil.ExcelReader;

public class Base {


	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
//	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	//public static ExcelReader excel;

	@BeforeSuite
	public void setUp() throws InterruptedException {
		if(driver==null){
			try {
				fis = new FileInputStream((System.getProperty("user.dir"))+"\\OR.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			//	log.debug("OR File Loaded");
			} catch (IOException e) {
				e.printStackTrace();
			}	 

			/*try {
				fis = new FileInputStream((System.getProperty("user.dir"))+"\\src\\DD_Google_TestConfig\\OR.Properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			//	log.debug("OR File Loaded");
			} catch (IOException e) {
				e.printStackTrace();
			}	 */

		}
		
		if(Config.getProperty("browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\Somesh data\\SeleniumWebDriver\\OldVersionOfDrivers\\chromedriver2.36.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get(Config.getProperty("TestSiteUrl"));
			Thread.sleep(3000);
		
		}else if (Config.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\Somesh data\\Selenium Class\\Jar Files\\geckodriver-v0.23\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get(Config.getProperty("TestSiteUrl"));
			Thread.sleep(3000);
		}	
			//driver.findElement(By.xpath(OR.getProperty("noThanks"))).click();

			/*	WebElement chromeoverlay=driver.findElement(By.xpath(OR.getProperty("ChromeOverlay")));
			 WebElement noThanks=driver.findElement(By.xpath(OR.getProperty("noThanks")));			
			if(chromeoverlay.isDisplayed()){
				noThanks.click();


	}		}*/
	
			  wait = new WebDriverWait(driver,40);

	}

	

	
	@AfterSuite
	public void close() {
		driver.close();
	//	log.debug("Windows close Successfully");

	}

}
