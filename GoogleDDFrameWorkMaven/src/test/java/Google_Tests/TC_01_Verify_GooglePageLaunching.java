package Google_Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Google_Core.CoreTest;
import Google_Util.testUtil;

//Complete
public class TC_01_Verify_GooglePageLaunching extends CoreTest {
	
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_01_Verify_GooglePageLaunching")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=1)
	public void VerifyGoogleLaunchingPage() throws IOException
	{
		try{
		
		//for Search Box
		WebElement gsearchbox = driver.findElement(By.xpath(object.getProperty("googlesearchbox")));
		Assert.assertTrue(gsearchbox.isEnabled());
		System.out.println("Google Search Box is present");
			
		//for Google Search Button
		WebElement gsearchbtn = driver.findElement(By.xpath(object.getProperty("googlesearchbtn")));
		Assert.assertTrue(gsearchbtn.isEnabled());
		System.out.println("Google Search Button is present");
		
		//for i'm Feeling Lucky Button
		WebElement lucky = driver.findElement(By.xpath(object.getProperty("feelingluckybtn")));
		Assert.assertTrue(lucky.isEnabled());
		System.out.println("I'm Feeling Lucky Button is present ");
			
		//for sign in button
		WebElement signin = driver.findElement(By.xpath(object.getProperty("signinbtn")));
		Assert.assertTrue(signin.isEnabled());
		app_logs.debug("***** Verify 1st TestCase Done Here *****");
		System.out.println("Signin Button is present ");
		System.out.println("<--------Test Case 1st is Successfully Completed-------->");
		}
		catch(Throwable t){
			testUtil.captureScreenshot("TC_01_Verify_GooglePageLaunching");
			Assert.assertTrue(false, t.getMessage());
		}
	
	}
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("TC_01_Verify_GooglePageLaunching");
	}
}	