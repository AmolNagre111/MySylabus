package Google_Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.internal.Maps;

import Google_Core.CoreTest;
import Google_Util.testUtil;

public class TC_03_VerifyAllGoogleApps_Launching extends CoreTest{
	SoftAssert softAssert;
		@BeforeTest
		public void isSkip() {
			
			if (!testUtil.isExecutable("TC_03_VerifyAllGoogleApps_Launching")) {
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		}

		@Test(priority=3)
		public void VerifyGoogleLaunchingPage() throws IOException
		{
		try{
			softAssert = new SoftAssert();
				
		//verify title of Google Account page Title Completed	
		driver.findElement(By.xpath(object.getProperty("Account"))).click();
		Thread.sleep(3000);
		String actualAccountTitle = driver.getTitle();
		System.out.println("ActualTitle: "+actualAccountTitle);
		String expected = "Google Account";
		System.out.println("Expected Title: "+expected);
		Assert.assertEquals(actualAccountTitle, expected);
		Thread.sleep(4000);
		System.out.println("Verify Google Account App");
		driver.navigate().back();
		Thread.sleep(4000);
		
		// Google Search isEnable or not Completed
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Search"))).click();// click on search app
		WebElement SearchBox = driver.findElement(By.xpath(object.getProperty("SearchBox")));
		WebElement SearchButton = driver.findElement(By.xpath(object.getProperty("SearchBtn")));
		WebElement FeelingLuckyBtn = driver.findElement(By.xpath(object.getProperty("FeelingLuckybtn")));
		SearchBox.isDisplayed();
		SearchButton.isDisplayed();
		FeelingLuckyBtn.isDisplayed();
		app_logs.debug("Verify Search App");
		System.out.println("Verify Search App");
		driver.navigate().back();
		Thread.sleep(4000);
			
		// Maps
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Maps"))).click();// click on Maps
		WebElement Mapsearchbox = driver.findElement(By.xpath(object.getProperty("MapSearchbox")));
		WebElement verticalButtons = driver.findElement(By.xpath(object.getProperty("VerticalBtns")));
		WebElement horizontalButtons = driver.findElement(By.xpath(object.getProperty("HorizontalBtns")));
		Thread.sleep(10000);
		//horizontalButtons.click();
		Assert.assertTrue(Mapsearchbox.isDisplayed());
		Assert.assertTrue(verticalButtons.isDisplayed());
		Assert.assertTrue(horizontalButtons.isDisplayed());
		app_logs.debug("Verify Google Maps App");
		System.out.println("Verify Google Maps App");
		driver.navigate().back();
		Thread.sleep(4000);
		//OR
		//Mapsearchbox.isDisplayed();
		//verticalButtons.isDisplayed();
		//horizontalButtons.isDisplayed();
		//Maps.isDisplayed();
					
		//YouTube
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		 driver.findElement(By.xpath(object.getProperty("YouTube"))).click();
		Thread.sleep(3000);
		String actualYouTubeTitle = driver.getTitle();
		System.out.println("ActualTitle: "+actualYouTubeTitle);
		String expectedYouTubeTitle = "YouTube";
		System.out.println("Expected Title: "+expectedYouTubeTitle);
		Assert.assertEquals(actualYouTubeTitle, expectedYouTubeTitle);
		System.out.println("Actual & Expected Title are Matched");
		Thread.sleep(4000);
		WebElement YouTubeSearchBox = driver.findElement(By.xpath(object.getProperty("YouTubeSearchBox")));
		WebElement YouTubeSignInBtn = driver.findElement(By.xpath(object.getProperty("YouTubeSignInBtn")));
		Assert.assertTrue(YouTubeSearchBox.isDisplayed());
		Assert.assertTrue(YouTubeSignInBtn.isDisplayed());
		app_logs.debug("Verify YouTube App");
		System.out.println("Verify YouTube App");
		driver.navigate().back();
		Thread.sleep(4000);
		
		//Google Play
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Play"))).click();
		Thread.sleep(3000);
		String actualPlayTitle = driver.getTitle();
		System.out.println("ActualTitle: "+actualPlayTitle);
		String expectedPlayTitle = "Google Play";
		System.out.println("Expected Title: "+expectedPlayTitle);
		Assert.assertEquals(actualPlayTitle,expectedPlayTitle);
		System.out.println("Actual & Expected Title are Matched");
		Thread.sleep(4000);
		WebElement EntertainmentFrame = driver.findElement(By.xpath(object.getProperty("EntertainmentFrame")));
		WebElement GooglePlaySearchBox = driver.findElement(By.xpath(object.getProperty("GooglePlaySearchBox")));
		Assert.assertTrue(EntertainmentFrame.isDisplayed());
		Assert.assertTrue(GooglePlaySearchBox.isDisplayed());
		app_logs.debug("Verify Google Play App");
		System.out.println("Verify Google Play App");
		driver.navigate().back();
		Thread.sleep(4000);
		
		//Google News
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("News"))).click();
		Thread.sleep(3000);
		String actualNewsTitle = driver.getTitle();
		System.out.println("ActualTitle: "+actualNewsTitle);
		String expectedNewsTitle = "Google News";
		System.out.println("Expected Title: "+expectedNewsTitle);
		Assert.assertEquals(actualNewsTitle, expectedNewsTitle);
		System.out.println("Actual & Expected Title are Matched");
		Thread.sleep(4000);
		WebElement TopStories = driver.findElement(By.xpath(object.getProperty("TopStories")));
		Assert.assertTrue(TopStories.isDisplayed());
		app_logs.debug("Verify Google News App");
		System.out.println("Verify Google News App");
		driver.navigate().back();
		Thread.sleep(4000);
		
		//Gmail
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Gmail"))).click();
		Thread.sleep(5000);
		WebElement Gmail_Logo = driver.findElement(By.xpath(object.getProperty("Gmail_Logo")));
		WebElement Gmail_Signin = driver.findElement(By.xpath(object.getProperty("Gmail_Signin")));
		WebElement Gmail_CreateAccount = driver.findElement(By.xpath(object.getProperty("Gmail_CreateAccount")));
		Assert.assertTrue(Gmail_Logo.isDisplayed());
		Assert.assertTrue(Gmail_Signin.isDisplayed());
		Assert.assertTrue(Gmail_CreateAccount.isDisplayed());		
		Thread.sleep(4000);
		app_logs.debug("Verify Gmail App");
		System.out.println("Verify Gmail App");
		driver.navigate().back();
		Thread.sleep(4000);
			
		//Verify Drive
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Drive"))).click();
		Thread.sleep(4000);
		WebElement Google_DriveLogo = driver.findElement(By.xpath(object.getProperty("Google_DriveLogo")));
		WebElement Google_Drive = driver.findElement(By.xpath(object.getProperty("Google_Drive")));
		WebElement GoTo_GoogleDrive = driver.findElement(By.xpath(object.getProperty("GoTo_GoogleDrive")));
		WebElement Try_Drive = driver.findElement(By.xpath(object.getProperty("Try_Drive")));
		
		Assert.assertTrue(Google_DriveLogo.isDisplayed());
		Assert.assertTrue(Google_Drive.isDisplayed());
		Assert.assertTrue(GoTo_GoogleDrive.isDisplayed());
		Assert.assertTrue(Try_Drive.isDisplayed());
		
		app_logs.debug("Verify Google Drive App");
		System.out.println("Verify Google Drive App");
		driver.navigate().back();
		Thread.sleep(4000);
		
		//Translate
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Translate"))).click();
		Thread.sleep(4000);
		String actualTranslateTitle = driver.getTitle();
		System.out.println("ActualTitle: "+actualTranslateTitle);
		String expectedTranslateTitle = "Google Translate";
		System.out.println("Expected Title: "+expectedTranslateTitle);
		Assert.assertEquals(actualTranslateTitle, expectedTranslateTitle);
		System.out.println("Actual & Expected Title are Matched");
		Thread.sleep(4000);
		WebElement Signin_Button = driver.findElement(By.xpath(object.getProperty("Signin_Button")));
		Assert.assertTrue(Signin_Button.isDisplayed());
		app_logs.debug("Verify Google Translate App");
		System.out.println("Verify Google Translate App");
		Thread.sleep(4000);
		driver.navigate().back();
		
		System.out.println("<--------Test Case 3rd is Successfully Completed-------->");
		softAssert.assertAll();
		
		}
		catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_03_VerifyAllGoogleApps_Launching");
			Assert.assertTrue(false, t.getMessage());
		}
		
	}
		@DataProvider
		public static Object[][] getData()
		{
		return testUtil.getData("TC_03_VerifyAllGoogleApps_Launching");
			
		}
}
/*
  		//Photos			
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();//Click on GoogleApp Button
		driver.switchTo().frame(0);//focus on all apps frame
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Photos"))).click();
		WebElement Google_Photos_Logo = driver.findElement(By.xpath(object.getProperty("Google_Photos_Logo")));
		WebElement Go_To_Photos = driver.findElement(By.xpath(object.getProperty("Go_To_Photos")));
		Assert.assertTrue(Google_Photos_Logo.isDisplayed());
		Assert.assertTrue(Go_To_Photos.isDisplayed());
		app_logs.debug("Verify Google Photos App");
		app_logs.debug("***** Verify 3rd TestCase Done Here *****");
		System.out.println("Verify Google Photos App");
		driver.navigate().back();
		Thread.sleep(4000);	
 
 	//Meet
  		WebElement Meet = driver.findElement(By.xpath(object.getProperty("Meet")));
		Meet.isDisplayed();
		app_logs.debug("Verify Google Meet App");
		System.out.println("Verify Google Meet App");
		
			WebElement Contact = driver.findElement(By.xpath(object.getProperty("Contact")));
		Contact.isDisplayed();
		app_logs.debug("Verify Google Contact App");
		System.out.println("Verify Google Contact App");
		
		WebElement Deo = driver.findElement(By.xpath(object.getProperty("Deo")));
		Deo.isDisplayed();
		app_logs.debug("Verify Google Deo App");
		System.out.println("Verify Google Deo App");
					
		WebElement Shopping = driver.findElement(By.xpath(object.getProperty("Shopping")));
		Shopping.isDisplayed();
		app_logs.debug("Verify Google Shopping App");
		System.out.println("Verify Google Shopping App");
		
			WebElement Calender = driver.findElement(By.xpath(object.getProperty("Calender")));
		Calender.isDisplayed();
		app_logs.debug("Verify Calender App");
		System.out.println("Verify Calender App");
		driver.navigate().back();
		Thread.sleep(4000);
 */
