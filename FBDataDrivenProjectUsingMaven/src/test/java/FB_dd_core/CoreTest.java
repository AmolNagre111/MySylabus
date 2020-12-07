package FB_dd_core;

import java.io.FileInputStream;



import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import FB_dd_util.ExcelReader;
import FB_dd_util.TestConfig;
import FB_dd_util.monitoringMail;
import FB_dd_util.testUtil;



public class CoreTest {
	
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver = null;
	public static FileInputStream fis;
	public static Logger app_logs = Logger.getLogger("devpinoyLogger");
	
	@BeforeSuite
	public void intial() throws IOException, InterruptedException{
		if(driver==null)
		{
			// Loading a file into fis(FileInputStream)
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			config.load(fis);
			app_logs.debug("Loading Config.properties file");
			
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\object.properties");
			object.load(fis);
			app_logs.debug("Loading object.properties file");
			
			excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\FB_dd_properties\\testData.xlsx");
			app_logs.debug("Loading Excel file");
			
			// Launching Browsers here is called Generic code
			if(config.getProperty("browser").equals("chrome"))// taking from config.properties file if we want to any changes do there
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
				driver=new ChromeDriver();
				app_logs.debug("Launching Google Chrome Browser");
			
			}else if(config.getProperty("browser").equals("firefox"))// taking from config.properties file if we want to any changes do there
			{
					System.setProperty("webdriver.gecko.driver","C:\\Selenium WebDrivers\\geckodriver.exe");
					driver=new FirefoxDriver();
					//app_logs.debug("Launching Firefox Chrome Browser");
			}else if(config.getProperty("browser").equals("ie"))// taking from config.properties file if we want to any changes do there
			{
					System.setProperty("webdriver.ie.driver","C:\\Selenium WebDrivers\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
					//app_logs.debug("Launching Interner Explorer Chrome Browser");
			}
			
			driver.get(config.getProperty("testsite"));// taking from config.properties file if we want to any changes do there
			//driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			//Thread.sleep(2000);
		}
}
/*	@AfterSuite
	public void QuitDriver()
	{
		//if(driver!=null)
		app_logs.debug("Sending Mail");
		
			testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
			monitoringMail mail = new monitoringMail();
			
				try {
					mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath,TestConfig.attachmentName);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Sending mail successfully...");
				
			app_logs.debug("Closing Browser");
			//driver.close();
}
*/	
}

