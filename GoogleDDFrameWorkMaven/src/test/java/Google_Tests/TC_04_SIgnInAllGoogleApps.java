package Google_Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import Google_Core.CoreTest;
import Google_Util.testUtil;

public class TC_04_SIgnInAllGoogleApps extends CoreTest{
	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_04_SIgnInAllGoogleApps")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=4,dataProvider="getData")
	public void VerifyGoogleLaunchingPage(String email,String password) throws IOException
	{
		try{
			softAssert = new SoftAssert();
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			// Login 1st SignIn Google Account click on SignIn button on top-left

			driver.findElement(By.xpath(object.getProperty("SignIn"))).click();
			driver.findElement(By.xpath(object.getProperty("EmailOrPhone"))).sendKeys(email);//Put Email id
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("NextButton"))).click();//Click on Next Button
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(password);// Put Password
			driver.findElement(By.xpath(object.getProperty("PasswordNextButton"))).click();// click on password Next Button
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("ClickEnglishLink"))).click();
			
			// Google Account Login & Verified Successfully
			 driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(object.getProperty("Account"))).click();
			Thread.sleep(3000);
			String actualAccountTitle = driver.findElement(By.xpath(object.getProperty("Welcome_Title"))).getText();
			System.out.println("ActualTitle: "+actualAccountTitle);
			String expected = "Welcome, Amol Nagre";
			System.out.println("Expected Title: "+expected);
			Assert.assertEquals(actualAccountTitle, expected);
			System.out.println("Welcome Heading is Match with Expetations..");
			Thread.sleep(4000);
			System.out.println("---Google Account App is Login & Verified Successfully");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			
			//Search App Login & Verified Successfully
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			driver.findElement(By.xpath(object.getProperty("Search"))).click();
			Thread.sleep(3000);
			
			WebElement Verify_Image = driver.findElement(By.xpath(object.getProperty("Verify_Image")));
			Assert.assertTrue(Verify_Image.isEnabled());
			System.out.println("---Google Search App is Login & Verified Successfully");
			driver.navigate().back();
			Thread.sleep(4000);
			
			//Maps
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("Maps"))).click();// click on Maps
			Thread.sleep(5000);
			//driver.findElement(By.xpath(object.getProperty("MapsSignin"))).click();
			//driver.navigate().back();
			//Thread.sleep(4000);
			WebElement Verify_Image_Maps = driver.findElement(By.xpath(object.getProperty("Map_Login_Image")));
			Assert.assertTrue(Verify_Image_Maps.isEnabled());
			System.out.println("---Google Maps App is Login & Verified Successfully");
			app_logs.debug("Verify Google Maps App");
			driver.navigate().back();
			Thread.sleep(3000);
			
			//YouTube
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("YouTube"))).click();// click on Maps
			Thread.sleep(4000);
			WebElement Verify_Image_YouTube = driver.findElement(By.xpath(object.getProperty("Youtube_Login_Image")));
			Assert.assertTrue(Verify_Image_YouTube.isEnabled());			
			app_logs.debug("Verify Google YoutTube App");
			System.out.println("---Google YouTube App is Login & Verified Successfully");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Play
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("Play"))).click();// click on Maps
			Thread.sleep(4000);
			WebElement Verify_Image_Play = driver.findElement(By.xpath(object.getProperty("Verify_Image_Play")));
			Assert.assertTrue(Verify_Image_Play.isEnabled());			
			app_logs.debug("Verify Google Play App");
			System.out.println("---Google Play App is Login & Verified Successfully");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			//News
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("News"))).click();// click on Maps
			Thread.sleep(4000);
			WebElement Verify_Image_News = driver.findElement(By.xpath(object.getProperty("Verify_Image_News")));
			Assert.assertTrue(Verify_Image_News.isEnabled());			
			app_logs.debug("Verify Google News App");
			System.out.println("---Google News App is Login & Verified Successfully");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(3000);
			//Gmail_Logo=/html/body/div[2]/div[1]/div[2]/div[2]/div/span
			
			//Gmail
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("Gmail"))).click();// click on Maps
			Thread.sleep(4000);
			WebElement Verify_Image_Gmail = driver.findElement(By.xpath(object.getProperty("Verify_Image_Gmail")));
			Assert.assertTrue(Verify_Image_Gmail.isEnabled());			
			app_logs.debug("Verify Gmail App");
			System.out.println("---Gmail App is Login & Verified Successfully");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Drive
			driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			driver.switchTo().frame(0);//focus on all apps frame
			Thread.sleep(2000);
			driver.findElement(By.xpath(object.getProperty("Drive"))).click();// click on Maps
			Thread.sleep(4000);
			WebElement Verify_Image_Drive = driver.findElement(By.xpath(object.getProperty("Verify_Image_Drive")));
			Assert.assertTrue(Verify_Image_Drive.isEnabled());			
			app_logs.debug("Verify Drive App");
			app_logs.debug("***** Verify 4th TestCase Done Here *****");
			System.out.println("---Google Drive App is Login & Verified Successfully");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("<--------Test Case 4th is Successfully Completed-------->");
			
		}
		catch(Throwable t){
			testUtil.captureScreenshot("TC_04_SIgnInAllGoogleApps");
			Assert.assertTrue(false, t.getMessage());
		}
	}
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("TC_04_SIgnInAllGoogleApps");
	}
}









/*
 * //driver.findElement(By.xpath(object.getProperty("GoToGoogleAccount"))).click();//goto Google account Login Page
			//driver.findElement(By.xpath(object.getProperty("EmailOrPhone"))).sendKeys(email);//Put Email id
			//Thread.sleep(2000);
			//driver.findElement(By.xpath(object.getProperty("NextButton"))).click();//Click on Next Button
			//Thread.sleep(4000);
			//driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(password);// Put Password
			//driver.findElement(By.xpath(object.getProperty("PasswordNextButton"))).click();// click on password Next Button
			 //driver.findElement(By.xpath(object.getProperty("GoogleAppButton"))).click();//Click on GoogleApp Button
			//driver.switchTo().frame(0);//focus on all apps frame
			//Thread.sleep(3000);
			 * 
			 * 
 */


