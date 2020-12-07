package Google_Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Google_Core.CoreTest;
import Google_Util.testUtil;
//Complete
public class TC_06_OpenCloseBrowsers extends CoreTest{


		SoftAssert softAssert;
		@BeforeTest
		public void isSkip() {
			
			if (!testUtil.isExecutable("TC_06_OpenCloseBrowsers")) 
			{
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		}
		@Test(priority=6)
		public void VerifyOpenAnsCloseBrowsers() throws IOException
		{
			try{
				Thread.sleep(4000);
				System.out.println("Browser is Open & Close Successfully");
				app_logs.debug("Browser is Open & Close Successfully");
				app_logs.debug("***** Verify 6th TestCase Done Here *****");
				System.out.println("<--------Test Case 6th is Successfully Completed-------->");
			}
			catch(Throwable t){
				testUtil.captureScreenshot("TC_05_VerifyAllLanguageLinks");
				Assert.assertTrue(false, t.getMessage());
			}
		}
		@DataProvider
		public static Object[][] getData()
		{
			return testUtil.getData("TC_06_OpenCloseBrowsers");
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