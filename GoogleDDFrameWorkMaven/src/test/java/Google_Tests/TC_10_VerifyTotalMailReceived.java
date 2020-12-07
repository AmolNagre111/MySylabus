package Google_Tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
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

public class TC_10_VerifyTotalMailReceived extends CoreTest {

	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_10_VerifyTotalMailReceived")) 
		{
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=10,dataProvider="getData")
	public void VerifyTotalNoOfEmailReceived(String email,String password) throws IOException
	{
		try{
	
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			driver.findElement(By.xpath(object.getProperty("gmail"))).click();
			//driver.findElement(By.xpath(object.getProperty("signin"))).click();
			
/*			//handle the child window
			Set<String>handel= driver.getWindowHandles();
			Iterator<String>it=handel.iterator();
			String parent =it.next();
			String chiled=it.next();
			driver.switchTo().window(chiled);
			//driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath(object.getProperty("EmailOrPhone"))).sendKeys(email);//Put Email id
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("NextButton"))).click();//Click on Next Button
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(password);// Put Password
			driver.findElement(By.xpath(object.getProperty("PasswordNextButton"))).click();// click on password Next Button
			Thread.sleep(2000);
			
		    String str1=driver.findElement(By.xpath("(//span[@class='ts'])[3]")).getText();
		    System.out.println(str1);
		    
		    Thread.sleep(3000);*/
			
			//int countmails = driver.findElement(By.xpath(object.getProperty("NoOfMails"))).getText();
			System.out.println(driver.findElement(By.xpath("No.of Emails: "+object.getProperty("NoOfMails"))).getText());//3
			String str = driver.findElement(By.xpath(object.getProperty("NoOfMails"))).getText();
			//int totalMail = Integer.parseInt("str");//3
			String inboxtotalmail = driver.findElement(By.xpath(object.getProperty("inbox"))).getText();
			System.out.println("Inbox Emails: "+inboxtotalmail);
			
			if(str.equals(inboxtotalmail))
			{
				System.out.println("Both Mails are Matched ");
			}else
			{
				System.out.println("Both Mails are does not Matched ");			
			}
			app_logs.debug("***** Verify 10th TestCase Done Here *****");
			System.out.println("<--------Test Case 10th is Successfully Completed-------->");
		}
		catch(Throwable t){
		testUtil.captureScreenshot("TC_10_VerifyTotalMailReceived");
		Assert.assertTrue(false, t.getMessage());
	}
}
		@DataProvider
		public static Object[][] getData()
		{
			return testUtil.getData("TC_10_VerifyTotalMailReceived");
		}
}
