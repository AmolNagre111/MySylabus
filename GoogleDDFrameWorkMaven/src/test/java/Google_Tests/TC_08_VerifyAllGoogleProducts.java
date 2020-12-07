package Google_Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Google_Core.CoreTest;
import Google_Util.testUtil;

//Completed
public class TC_08_VerifyAllGoogleProducts extends CoreTest{
	
	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_08_VerifyAllGoogleProducts")) 
		{
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=8)
	public void VerifyGoogleAllApps() throws IOException
	{
		try{
			// go to Products ---> About --->  Products ---> goto down
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			driver.findElement(By.xpath(object.getProperty("About"))).click();
			driver.findElement(By.xpath(object.getProperty("Products"))).click();
			
			  WebElement sourceElement = driver.findElement(By.xpath(object.getProperty("SourceElement")));
			  WebElement targetElement = driver.findElement(By.xpath(object.getProperty("TargetElemetnt")));
		      // Capture x and y offset positions of element
			  
			  Actions action = new Actions(driver);
			//action.moveToElement(targetElement).clickAndHold().moveToElement(sourceElement).build().perform();
			action.moveToElement(targetElement).clickAndHold(sourceElement).build().perform();
			Thread.sleep(5000);
			app_logs.debug("Mouse Down operation");
			   
			//driver.findElement(By.xpath(object.getProperty("Products"))).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(5000);

			WebElement AA = driver.findElement(By.xpath(object.getProperty("AndroidAuto")));
			boolean AndroidAuto = AA.isDisplayed();
			Assert.assertTrue(AndroidAuto);
			        System.out.println("Verify AndroidAuto");
			        app_logs.debug("Verify AndroidAuto");
			       
			WebElement AO = driver.findElement(By.xpath(object.getProperty("AndroidOS")));
			boolean AndroidOS = AO.isDisplayed();
			Assert.assertTrue(AndroidOS);
			        System.out.println("Verify AndroidOS");
			        app_logs.debug("Verify AndroidOS");
			       
			WebElement AT = driver.findElement(By.xpath(object.getProperty("AndroidTV")));
			boolean AndroidTV = AT.isDisplayed();
			Assert.assertTrue(AndroidTV);
			        System.out.println("Verify AndroidTV");
			        app_logs.debug("Verify AndroidTV");
			       
			WebElement Cb = driver.findElement(By.xpath(object.getProperty("Cardboard")));
			boolean Cardboard = Cb.isDisplayed();
			Assert.assertTrue(Cardboard);
			        System.out.println("Verify Cardboard");
			        app_logs.debug("Verify Cardboard");
			       
			WebElement Chrm = driver.findElement(By.xpath(object.getProperty("Chrome")));
			boolean Chrome = Chrm.isDisplayed();
			Assert.assertTrue(Chrome);
			         System.out.println("Verify Chrome ");
			         app_logs.debug("Verify Chrome");
			         
			         
			WebElement CWS = driver.findElement(By.xpath(object.getProperty("ChromeWebStore")));
			boolean ChromeWebStore = CWS.isDisplayed();
			Assert.assertTrue(ChromeWebStore);
			System.out.println("Verify ChromeWebStore");
			app_logs.debug("Verify ChromeWebStore");

			WebElement Cbk = driver.findElement(By.xpath(object.getProperty("Chromebook")));
			boolean Chromebook = Cbk.isDisplayed();
			Assert.assertTrue(Chromebook);
			System.out.println("Verify Chromebook");
			app_logs.debug("Verify Chromebook");

			WebElement Cc = driver.findElement(By.xpath(object.getProperty("Chromecast")));
			boolean Chromecast = Cc.isDisplayed();
			Assert.assertTrue(Chromecast);
			System.out.println("Verify Chromecast");
			app_logs.debug("Verify Chromecast");

			WebElement CH = driver.findElement(By.xpath(object.getProperty("ConnectedHome")));
			boolean ConnectedHome = CH.isDisplayed();
			Assert.assertTrue(ConnectedHome);
			System.out.println("Verify ConnectedHome");
			app_logs.debug("Verify ConnectedHome");

			WebElement Cts = driver.findElement(By.xpath(object.getProperty("Contacts")));
			boolean Contacts = Cts.isDisplayed();
			Assert.assertTrue(Contacts);
			System.out.println("Verify Contacts");
			app_logs.debug("Verify Contacts");

			WebElement Ds = driver.findElement(By.xpath(object.getProperty("Docs")));
			boolean Docs = Ds.isDisplayed();
			Assert.assertTrue(Docs);
			System.out.println("Verify Docs");
			app_logs.debug("Verify Docs");

			WebElement Erth = driver.findElement(By.xpath(object.getProperty("Earth")));
			boolean Earth = Erth.isDisplayed();
			Assert.assertTrue(Earth);
			System.out.println("Verify Earth");
			app_logs.debug("Verify Earth");

			WebElement finance = driver.findElement(By.xpath(object.getProperty("Finance")));
			boolean Finance = finance.isDisplayed();
			Assert.assertTrue(Finance);
			System.out.println("Verify Finance");
			app_logs.debug("Verify Finance");

			WebElement forms = driver.findElement(By.xpath(object.getProperty("Forms")));
			boolean Forms = forms.isDisplayed();
			Assert.assertTrue(Forms);
			System.out.println("Verify Forms");
			app_logs.debug("Verify Forms");

			WebElement gboard = driver.findElement(By.xpath(object.getProperty("Gboard")));
			boolean Gboard = gboard.isDisplayed();
			Assert.assertTrue(Gboard);
			System.out.println("Verify Gboard");
			app_logs.debug("Verify Gboard");

			WebElement gmail = driver.findElement(By.xpath(object.getProperty("GmailApp")));
			boolean Gmail = gmail.isDisplayed();
			Assert.assertTrue(Gmail);
			System.out.println("Verify Gmail");
			app_logs.debug("Verify Gmail");

			WebElement GA = driver.findElement(By.xpath(object.getProperty("GoogleAlerts")));
			boolean GoogleAlerts = GA.isDisplayed();
			Assert.assertTrue(GoogleAlerts);
			System.out.println("Verify GoogleAlerts");
			app_logs.debug("Verify GoogleAlerts");

			WebElement GAt = driver.findElement(By.xpath(object.getProperty("GoogleAssistant")));
			boolean GoogleAssistant = GAt.isDisplayed();
			Assert.assertTrue(GoogleAssistant);
			System.out.println("Verify GoogleAssistant");
			app_logs.debug("Verify GoogleAssistant");

			WebElement GC = driver.findElement(By.xpath(object.getProperty("GoogleCast")));
			boolean GoogleCast = GC.isDisplayed();
			Assert.assertTrue(GoogleCast);
			System.out.println("Verify GoogleCast");
			app_logs.debug("Verify GoogleCast");

			WebElement Gmt = driver.findElement(By.xpath(object.getProperty("GoogleMeet")));
			boolean GoogleMeet = Gmt.isDisplayed();
			Assert.assertTrue(GoogleMeet);
			System.out.println("Verify GoogleMeet");
			app_logs.debug("Verify GoogleMeet");
			app_logs.debug("<--------Test Case 8th is Successfully Completed-------->");

			/*WebElement Gc = driver.findElement(By.xpath(config.getProperty("GoogleChat")));
			boolean GoogleChat = Gc.isDisplayed();
			Assert.assertTrue(GoogleChat);
			System.out.println("Verify GoogleChat");*/
			System.out.println("***** Test 8th is Successfully Completed... *****");
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
		}
	catch(Throwable t){
		testUtil.captureScreenshot("TC_08_VerifyAllGoogleProducts");
		Assert.assertTrue(false, t.getMessage());
	}

}
@DataProvider
public static Object[][] getData()
{
	return testUtil.getData("TC_08_VerifyAllGoogleProducts");
}
public static boolean isDisappear(boolean links)
{
	if(!links)
	{
		return true;
	}else
	{
		return false;
	}
}
}



//driver.navigate().back()

/*Thread.sleep(3000);
driver.get(config.getProperty("testsite2"));

driver.findElement(By.linkText("About")).click();
app_logs.debug("Click On About");
Thread.sleep(2000);
driver.findElement(By.linkText("Products")).click();
app_logs.debug("Click On Products");*/

/*Actions action = new Actions(driver);
//action.moveToElement(targetElement).clickAndHold().moveToElement(sourceElement).build().perform();
action.moveToElement(targetElement).clickAndHold(sourceElement).build().perform();
Thread.sleep(5000);
String startswith = "//*[@id='zippy-1-content']/div/ul/li[";
String endswith = "]/a";

for(int i=1;i<=68;i++)
	{
		String xpath=driver.findElement(By.xpath(startswith+i+endswith)).getText();   
		WebElement ans = driver.findElement(By.xpath("xpath"));
		Assert.assertTrue(ans.isEnabled());
		System.out.println(xpath);//simply try to fetch all products name
	
	}

//driver.findElement(By.linkText("Stories")).sendKeys(Keys.PAGE_DOWN);
Thread.sleep(5000);*/

