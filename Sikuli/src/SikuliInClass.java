import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import Sikuli_Properties_files.*;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliInClass {
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver = null;
	public static FileInputStream fis;
	public static Logger app_logs = Logger.getLogger("devpinoyLogger");
	

	public static void main(String[] args) throws FindFailed, IOException {
		// Loading a file into fis(FileInputStream)
	fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Sikuli_Properties_files\\config.properties");
	config.load(fis);
	//app_logs.debug("Loading Config.properties file");
					
	fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Sikuli_Properties_files\\object.properties");
	object.load(fis);
	//app_logs.debug("Loading object.properties file");
					
	//ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\dd_properties\\testData.xlsx");
	//app_logs.debug("Loading Excel file");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(object.getProperty("username"))).sendKeys("9970814338");
	 	
		//Password of FB
		driver.findElement(By.xpath(object.getProperty("password"))).sendKeys("Amol@1988");
		
		// LoginButton 
		driver.findElement(By.xpath(object.getProperty("login"))).click();
	
		// click on profile button
			driver.findElement(By.xpath(object.getProperty("uploadphotopath1"))).click();
		//	driver.findElement(By.xpath("//span[text()='Amol']")).click();

				
				//click on profile photo button
			driver.findElement(By.xpath(object.getProperty("uploadphotopath2"))).click();
				
				//click on profile photo button second
			driver.findElement(By.xpath(object.getProperty("uploadphotopath3"))).click();

				Screen screen = new Screen();
				
				Pattern Img1 = new Pattern("C:\\ScreenShot\\Capture_Amol_1.PNG");
				Pattern Img2 = new Pattern("C:\\ScreenShot\\Capture_Amol_2.PNG");
				
				screen.wait(Img1,20);
		
				//path of the file which we want to load
				screen.type(Img1,"C:\\Users\\Amol\\Desktop\\Amol.jpeg");
				screen.click(Img2);
		
				driver.findElement(By.xpath(object.getProperty("savebutton"))).click();
		
		System.out.println("Photo successfully Uploaded...");
		
	}
}
