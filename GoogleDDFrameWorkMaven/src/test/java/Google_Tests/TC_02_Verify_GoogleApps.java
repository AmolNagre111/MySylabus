package Google_Tests;

import java.io.IOException;
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

public class TC_02_Verify_GoogleApps extends CoreTest {
	SoftAssert softAssert;	
	@BeforeTest	//Runmode check is executable or not
	public void isSkip() {
		
		if (!testUtil.isExecutable("TC_02_Verify_GoogleApps")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=2)
	public void VerifyGoogleAllApps() throws IOException
	{
		try{
			softAssert = new SoftAssert();
		//click on Google apps button
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		// check (All Google Apps) web object is present or not on webpage
		driver.switchTo().frame(0);//focus on all apps frame
		
		WebElement Account = driver.findElement(By.xpath(object.getProperty("Account")));
		Account.isDisplayed();
		app_logs.debug("Verify Google Account App");
		System.out.println("Verify Google Account App");
		
		WebElement Search = driver.findElement(By.xpath(object.getProperty("Search")));
		Search.isDisplayed();
		app_logs.debug("Verify Search App");
		System.out.println("Verify Search App");
		
		WebElement Maps = driver.findElement(By.xpath(object.getProperty("Maps")));
		Maps.isDisplayed();
		app_logs.debug("Verify Google Maps App");
		System.out.println("Verify Google Maps App");
		
		WebElement YouTube = driver.findElement(By.xpath(object.getProperty("YouTube")));
		YouTube.isDisplayed();
		app_logs.debug("Verify YouTube App");
		System.out.println("Verify YouTube App");
		
		WebElement Play = driver.findElement(By.xpath(object.getProperty("Play")));
		Play.isDisplayed();
		app_logs.debug("Verify Google Play App");
		System.out.println("Verify Google Play App");
		
		WebElement News = driver.findElement(By.xpath(object.getProperty("News")));
		News.isDisplayed();
		app_logs.debug("Verify Google News App");
		System.out.println("Verify Google News App");
		
		WebElement Gmail = driver.findElement(By.xpath(object.getProperty("Gmail")));
		Gmail.isDisplayed();
		app_logs.debug("Verify Gmail App");
		System.out.println("Verify Gmail App");
		
		WebElement Meet = driver.findElement(By.xpath(object.getProperty("Meet")));
		Meet.isDisplayed();
		app_logs.debug("Verify Google Meet App");
		System.out.println("Verify Google Meet App");
		
		WebElement Contact = driver.findElement(By.xpath(object.getProperty("Contact")));
		Contact.isDisplayed();
		app_logs.debug("Verify Google Contact App");
		System.out.println("Verify Google Contact App");
		
		WebElement Drive = driver.findElement(By.xpath(object.getProperty("Drive")));
		Drive.isDisplayed();
		app_logs.debug("Verify Google Drive App");
		System.out.println("Verify Google Drive App");
		
		WebElement Calender = driver.findElement(By.xpath(object.getProperty("Calender")));
		Calender.isDisplayed();
		app_logs.debug("Verify Calender App");
		System.out.println("Verify Calender App");
		
		WebElement Translate = driver.findElement(By.xpath(object.getProperty("Translate")));
		Translate.isDisplayed();
		app_logs.debug("Verify Google Translate App");
		app_logs.debug("***** Verify 2nd TestCase Done Here *****");
		System.out.println("Verify Google Translate App");
		
		System.out.println("<--------Test Case 2nd is Successfully Completed-------->");
		softAssert.assertAll();
		/*
		String str1="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
		String str2 = "]/a/div/span";
		for(int i=1; i <= 15; i++)
		{
			String result=(str1)+(i)+(str2);
			String x=driver.findElement(By.xpath((str1)+(i)+(str2))).getText();  
			Assert.assertTrue(true,x);
			System.out.println(x);
		}	*/
		
		//Account.click();//just for confirmation
		}
		catch(Throwable t){
			testUtil.captureScreenshot("TC_02_Verify_GoogleApps");
			
			Assert.assertTrue(false, t.getMessage());
		}
	}
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("TC_02_Verify_GoogleApps");
	}
}




//driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")).click();
/*
 * for (int i = 0; i < 15; i++) {
			Thread.sleep(1000);
			Assert.assertTrue(allApps.isDisplayed());
		}
		System.out.println("All Apps are Displayed Successfully....");
	
	
		//WebElement frame = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]"));// //ul[@jsname='k77Iif']
 */



/*	WebElement Photos = driver.findElement(By.xpath(object.getProperty("Photos")));
		Photos.isDisplayed();
		app_logs.debug("Verify Google Photos App");
		System.out.println("Verify Google Photos App");
		
		WebElement Deo = driver.findElement(By.xpath(object.getProperty("Deo")));
		Deo.isDisplayed();
		app_logs.debug("Verify Google Deo App");
		System.out.println("Verify Google Deo App");
		
		WebElement Shopping = driver.findElement(By.xpath(object.getProperty("Shopping")));
		Shopping.isDisplayed();
		app_logs.debug("Verify Google Shopping App");
		System.out.println("Verify Google Shopping App");
 * 
 */










/*@Test()
public void VerifyGoogleLaunchingPage() throws IOException
{
	// get google home page url from config.properties
	//driver.get("https://www.google.co.in/");
	
	// check (All Google Apps) web object is present or not on webpage
	//List <WebElement> checkbox = driver.findElements(By.name("//*[@class='j1ei8c']"));// in all checkbox have same name or common elements
	//driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")).click();
	
	WebElement link=driver.findElement(By.xpath("//*[@class='j1ei8c']"));//Xpath of particular dropdown list
	
	List <WebElement> links=link.findElements(By.tagName("option"));// use option in particular dropdown list
	
	String str1="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
	String str2 = "]/a/div/span";
	for(int i=0;i<links.size();i++)
	{
		String result=(str1)+(i)+(str2);
		System.out.println(result);
	}
}*/

/*			
WebElement link=driver.findElement(By.xpath("//*[@class='j1ei8c']"));//Xpath of particular dropdown list
System.out.println(link.getSize());
System.out.println(link.getText());

List <WebElement> links=link.findElements(By.tagName("option"));// use option in particular dropdown list
*/	
/*String xp_start="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
String xp_end="]/a/div/span";

Thread.sleep(3000L);
int rownum=0;
for(int i=0;i<12;i++)
{
	boolean x=driver.findElement(By.xpath(xp_start+i+xp_end)).isEnabled();
	driver.findElement(By.xpath(xp_start+i+xp_end)).getText();
	rownum++;
	//Assert.assertTrue(signin.isEnabled());
	System.out.println(x);
	System.out.println();
}*/
//System.out.println("Row Count is: "+rownum);

/*String str1="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
String str2 = "]/a/div/span";
for(int i=0;i<links.size();i++)
{
	String result=(str1)+(i)+(str2);
	System.out.println(result);
	System.out.println(driver.getTitle());
}*/

/*Assert.assertTrue(gsearchbtn.isEnabled());
System.out.println("Google Search Button is present");

//for i'm Feeling Lucky Button
WebElement lucky = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[2]"));
Assert.assertTrue(lucky.isEnabled());
System.out.println("I'm Feeling Lucky Button is present ");

//for Search Box
WebElement gsearchbox = driver.findElement(By.xpath("//input[@type='text']"));
Assert.assertTrue(gsearchbox.isEnabled());
System.out.println("gsearchbox is present");
	
//for sign in button
WebElement signin = driver.findElement(By.xpath("//a[@id='gb_70']"));
Assert.assertTrue(signin.isEnabled());
System.out.println("signin button is present ");
*/