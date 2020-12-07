package Google_Tests;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Google_Core.CoreTest;
import Google_Util.testUtil;
//7.To validate that the Google performs the search operation properly
//Input - Amitabh Bachchan,Abdul Kalam
//Complete
public class TC_07_VerifySearchOperationProperly extends CoreTest{

	SoftAssert softAssert;
	@BeforeTest
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_07_VerifySearchOperationProperly")) 
		{
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	@Test(priority=7)
	public void CountGivenLinks() throws IOException
	{
		try{
		 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath(object.getProperty("googlesearchbox"))).sendKeys("Amitabh Bachchan");
		driver.findElement(By.xpath(object.getProperty("googlesearchbox"))).sendKeys(Keys.ENTER);
		
		List<WebElement> list = driver.findElements(By.xpath(object.getProperty("TextName")));
		System.out.println("Total Links of Amitabh Bachchan is: "+list.size());
		// String s1 ="";
		for (int i = 0; i < list.size(); i++) 
			{
			WebElement totallinks = list.get(i);
			WebElement findlinks = driver.findElement(By.tagName("a"));
	
					if (totallinks.equals(findlinks)) 
					{
					System.out.println(totallinks.getSize());
					//System.out.println(sp.getText());
					}
			//System.out.println(totallinks.getText());
			}
		app_logs.debug("Display Amitabh Bachchan's Total links Here");
		app_logs.debug("***** Verify 7th TestCase Done Here *****");
		System.out.println("<--------Test Case 7th is Successfully Completed-------->");
		driver.navigate().back();
		
		}catch(Throwable t)
		{
		testUtil.captureScreenshot("TC_07_VerifySearchOperationProperly");
		Assert.assertTrue(false, t.getMessage());
		}
	}
		@DataProvider
		public static Object[][] getData()
		{
			return testUtil.getData("TC_07_VerifySearchOperationProperly");
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

//System.out.println(list.get(i).getText());
		// System.out.println("total no count: +");
		/*
		* list.get(0).click(); driver.navigate().back();
		*/
		
		/*List<WebElement> list = driver.findElements(By.xpath(object.getProperty("TextName")));// Amitabh Bachchan
		System.out.println("Total Linsk: "+list.size());
		//String str = "Amitabh Bachchan";
		//int count = 0;
		
		for(int i=0; i<list.size(); i++)
		{			
				WebElement sp = list.get(i);
				WebElement totallinks = driver.findElement(By.tagName("a"));

				if (sp.equals(totallinks)) {
				System.out.println(sp.getSize());
				//System.out.println(sp.getText());
				}
				System.out.println(sp.getText());
		}*/
		//System.out.println(count);
		//System.out.println("Number of Anchor Tags: "+driver.findElements(By.tagName("a")).size());
