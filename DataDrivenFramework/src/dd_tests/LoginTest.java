package dd_tests;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_core.TestCore;
import dd_util.testUtil;

public class LoginTest extends TestCore{
	
	// checking Skip testcases or not
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("LoginTest"))
		{
			throw new SkipException("Skipping the TestCase as runmode is set to No");
		}
	}
	
	@Test(dataProvider="getData")
	public void doLogin(String email,String password) throws IOException
	{
		try{
		app_logs.debug("Enetering Login Test and Enter Credentials");
		// username of FB
		driver.findElement(By.xpath(object.getProperty("username"))).sendKeys(email);
		
		//Password of FB
		driver.findElement(By.xpath(object.getProperty("password"))).sendKeys(password);
		
		// LoginButton 
		driver.findElement(By.xpath(object.getProperty("login"))).click();
		}catch(Throwable t){
			testUtil.captureScreenshot("LoginTest");
			Assert.assertTrue(false,t.getMessage());
		}
	
	}
	
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("LoginTest");
	}
}