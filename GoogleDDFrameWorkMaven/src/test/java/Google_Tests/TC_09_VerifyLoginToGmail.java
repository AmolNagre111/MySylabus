package Google_Tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class TC_09_VerifyLoginToGmail extends CoreTest{
	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_09_VerifyLoginToGmail")) 
		{
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	@Test(priority=9,dataProvider="getData")
	public void VerifyGoogleLaunchingPage(String email,String password) throws IOException
	{
		try{
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			driver.findElement(By.xpath(object.getProperty("gmail"))).click();
			driver.findElement(By.xpath(object.getProperty("signin"))).click();
			
			//handle the child window
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
						
			 WebElement targetElement = driver.findElement(By.xpath(object.getProperty("Compose")));
		      // Capture x and y offset positions of element

			  Actions action = new Actions(driver);
			  //action.moveToElement(targetElement).clickAndHold().moveToElement(sourceElement).build().perform();
			  action.moveToElement(targetElement).build().perform();
			  
			  WebElement AllElementsBox = driver.findElement(By.xpath(object.getProperty("Box")));
			  Assert.assertTrue(AllElementsBox.isEnabled());
			  System.out.println("Verify Compose Box...");
			  
			  WebElement VerifyName = driver.findElement(By.xpath(object.getProperty("VerifyNameImage")));
			  Assert.assertTrue(VerifyName.isEnabled());
			  System.out.println("Verify AmolNagre's Name...");
			  app_logs.debug("***** Verify 9th TestCase Done Here *****");
			  System.out.println("<--------Test Case 9th is Successfully Completed-------->");
			  driver.close();
			  driver.switchTo().window(parent);
			  Thread.sleep(2000);
			  driver.navigate().back();

		}
	catch(Throwable t){
		testUtil.captureScreenshot("TC_09_VerifyLoginToGmail");
		Assert.assertTrue(false, t.getMessage());
	}
}
		@DataProvider
		public static Object[][] getData()
		{
			return testUtil.getData("TC_09_VerifyLoginToGmail");
		}
}


/*
 * /*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[text()='Use another account']")).click();


		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[text()='Remove an account']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'RAYh1e LZgQXe')]/following-sibling::div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Yes, remove'])[2]")).click();*/


		/* Thread.sleep(2000);
		driver.findElement(By.linkText(object.getProperty("Signin1"))).click();


		//handle the child window
		Set<String>handel= driver.getWindowHandles();
		Iterator<String>it=handel.iterator();
		String parent =it.next();
		String chiled=it.next();
		driver.switchTo().window(chiled);
		
		//navigate to gmail.com
		    driver.navigate().to("https://mail.google.com/");
		    System.out.println(driver.getTitle());
		   
		    Thread.sleep(1000);
		   
		    WebElement UseAnotherAc=driver.findElement(By.xpath(object.getProperty("useAnothrAcc")));
		    UseAnotherAc.click();

		   driver.switchTo().frame(0);
		   //Thread.sleep(3000);
		   driver.findElement(By.xpath(object.getProperty("gmail"))).click();
		   app_logs.debug("Clink On gmail");
		   Thread.sleep(2000);
		             
		// xpath of FB username text box
		WebElement username= driver.findElement(By.xpath(object.getProperty("username")));
		username.sendKeys(email);
		app_logs.debug("Giving username");

		     
		WebElement Next=driver.findElement(By.xpath(object.getProperty("Next")));
        Next.click();
	    app_logs.debug("Click on Next Button");

	    Thread.sleep(5000);
       // xpath of FB password TextBOx
	   WebElement pass=driver.findElement(By.xpath(object.getProperty("password")));
	   pass.sendKeys(password);
	   app_logs.debug("Giving password");

	   // xpath of Log In Button
	   app_logs.debug("Click on login button");
	   Thread.sleep(3000);
	   WebElement Nextbtn=driver.findElement(By.xpath(object.getProperty("Nextbtn")));
	   Nextbtn.click();
	   app_logs.debug("login SignIn Successfully");

		int li=driver.findElements(By.xpath(object.getProperty("GmailBox"))).size();
		System.out.println(li);

		WebElement gmailbox = driver.findElement(By.xpath(object.getProperty("gmailbox")));
		Assert.assertTrue(gmailbox.isEnabled());
		System.out.println("verify gmailbox");
		app_logs.debug("verify gmailbox");


		/*WebElement More = driver.findElement(By.xpath(object.getProperty("More")));
		Assert.assertTrue(More.isEnabled());
		System.out.println("verify More");
		app_logs.debug("Tasks 9th are sucessfully complete....!");*/

		
		
				 
/*WebElement Compose = driver.findElement(By.xpath(object.getProperty("Compose")));
Assert.assertTrue(Compose.isEnabled());
System.out.println("verify Compose");
app_logs.debug("verify Compose");


WebElement Inbox = driver.findElement(By.xpath(object.getProperty("Inbox")));
Assert.assertTrue(Inbox.isEnabled());
System.out.println("verify Inbox");
app_logs.debug("verify Inbox");

WebElement Starred = driver.findElement(By.xpath(object.getProperty("Starred")));
Assert.assertTrue(Starred.isEnabled());
System.out.println("verify Starred");
app_logs.debug("verify Starred");

WebElement Snoozed = driver.findElement(By.xpath(object.getProperty("Snoozed")));
Assert.assertTrue(Snoozed.isEnabled());
System.out.println("verify Snoozed");
app_logs.debug("verify Snoozed");

WebElement Sent = driver.findElement(By.xpath(object.getProperty("Sent")));
Assert.assertTrue(Sent.isEnabled());
System.out.println("verify Sent");
app_logs.debug("verify Sent");

Thread.sleep(3000);
WebElement Drafts = driver.findElement(By.xpath(object.getProperty("Drafts")));
Assert.assertTrue(Drafts.isEnabled());
System.out.println("verify Draftst");
app_logs.debug("verify Draftst");*/
		//driver.switchTo().defaultContent();
 
