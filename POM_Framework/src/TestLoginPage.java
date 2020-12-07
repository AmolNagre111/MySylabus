import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class TestLoginPage {
	
	
	@Test
	public void doLogin() throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
		
		
		// comment due to we want to run only fbloginpage 
		/* Using 1st Way Page Object Factory to calling methods
		* // Upload Photo Test
		UploadPhotoPage up = new UploadPhotoPage(driver);
		up.clickProfileButton();
		up.clickUpdateButton();
		up.clickUploadPhotoButton();
		up.saveButton();*/
		/*
		//1. 1st Way Using Page Object Factory
		FaceBookLoginPage fb = new FaceBookLoginPage(driver);
		fb.EnterUsername();
		fb.EnterPassword();
		fb.ClickOnLoginButton();
		*/
		
		// 2nd way 
		FaceBookLoginPage fb = new FaceBookLoginPage(driver);
		fb.email().sendKeys("9970814338");
		fb.password().sendKeys("Amol@1988");
		fb.login().click();
		

		
		
		
	}

}
