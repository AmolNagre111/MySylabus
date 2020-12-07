package Google_Tests;

import java.io.IOException;
import java.security.Signature;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Google_Core.CoreTest;
import Google_Util.testUtil;
/*5.To verify that clicking on the language links
 *  (Hindi, Marathi etc) launches Google 
 *  in respective language
 */
//Complete
public class TC_05_VerifyAllLanguageLinks extends CoreTest{

	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		if (!testUtil.isExecutable("TC_05_VerifyAllLanguageLinks")) 
		{
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	@Test(priority=5)
	public void VerifyGoogleLaunchingPage() throws IOException
	{
		try{
			//Hindi Links Verification
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			driver.findElement(By.xpath(object.getProperty("ClickHindiLink"))).click();
			boolean Hindi = driver.findElement(By.xpath(object.getProperty("ClickHindiLink"))).isSelected();
			Thread.sleep(5000);
			boolean ans = isDisappear(Hindi);// call to isDisappear()
			Assert.assertTrue(ans);
			System.out.println("Hindi Links is DisAppear...");
			app_logs.debug("Click on Hindi Links");
			
			WebElement SearchButtonHindi=driver.findElement(By.xpath(object.getProperty("SearchButton")));
			WebElement FeelingLuckyButtonHindi=driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
			//WebElement SignInButtonHindi=driver.findElement(By.xpath(object.getProperty("SignInButton")));
			
			Assert.assertTrue(SearchButtonHindi.isEnabled());
			Assert.assertTrue(FeelingLuckyButtonHindi.isEnabled());
			//Assert.assertTrue(SignInButtonHindi.isEnabled());
			app_logs.debug("Verified Hindi Language Links");
			System.out.println("Verified Hindi Language Links...");
			Thread.sleep(3000);
			driver.navigate().back();
			
			//Marathi Links Verification
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			driver.findElement(By.xpath(object.getProperty("ClickMarathiLink"))).click();
			boolean Marathi = driver.findElement(By.xpath(object.getProperty("ClickMarathiLink"))).isSelected();
			Thread.sleep(5000);
			boolean ans1 = isDisappear(Hindi);// call to isDisappear()
			Assert.assertTrue(ans1);
			System.out.println("Marathi Links is DisAppear...");
			app_logs.debug("Click on Marathi Links");
			
			WebElement SearchButtonMarathi=driver.findElement(By.xpath(object.getProperty("SearchButton")));
			WebElement FeelingLuckyButtonMarathi=driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
			//WebElement SignInButtonMarathi=driver.findElement(By.xpath(object.getProperty("SignInButton")));
			
			Assert.assertTrue(SearchButtonMarathi.isEnabled());
			Assert.assertTrue(FeelingLuckyButtonMarathi.isEnabled());
			//Assert.assertTrue(SignInButtonMarathi.isEnabled());
			app_logs.debug("Verified Marathi Language Links");
			System.out.println("Verified Marathi Language Links...");
			Thread.sleep(3000);
			driver.navigate().back();
			driver.findElement(By.xpath(object.getProperty("ClickEnglishLink"))).click();
			app_logs.debug("Verified Marathi Language Links");
			app_logs.debug("***** Verify 5th TestCase Done Here *****");
			System.out.println("Verified Marathi Language Links...");
			System.out.println("***** <--------Test Case 5th is Successfully Completed-------->");
		}
		catch(Throwable t){
			testUtil.captureScreenshot("TC_05_VerifyAllLanguageLinks");
			Assert.assertTrue(false, t.getMessage());
		}
	}
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("TC_05_VerifyAllLanguageLinks");
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