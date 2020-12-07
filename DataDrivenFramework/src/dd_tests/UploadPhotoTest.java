package dd_tests;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_core.TestCore;
import dd_util.ExcelReader;
import dd_util.testUtil;

public class UploadPhotoTest extends TestCore {
	

	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("UploadPhotoTest"))// passing parameter of class UploadPhotoTest
		{
			throw new SkipException("Skipping the TestCase as runmode is set to No");
		}
	}
	
	@Test(dataProvider="getData")
	public void Uploading_Profile_photo(String path) throws SikuliException, InterruptedException, FindFailed, IOException
	{
		excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\dd_properties\\testData.xlsx");
		try{
			Thread.sleep(3000L);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		app_logs.debug("Uploading Photo Test");
				
		// click on profile1 button UploadPhotoPath1
		//driver.findElement(By.xpath("//span[text()='Amol']")).click();
		driver.findElement(By.xpath(object.getProperty("uploadphotopath1"))).click();
		Thread.sleep(2000);

		
		//click on profile2 photo buttonUploadPhotoPath2
		driver.findElement(By.xpath(object.getProperty("uploadphotopath2"))).click();
		Thread.sleep(2000);
		
		//click on profile3 photo button second UploadPhotoPath3
		driver.findElement(By.xpath(object.getProperty("uploadphotopath3"))).click();
		Thread.sleep(2000);

		Pattern Img1 = new Pattern("C:\\ScreenShot\\Capture_Amol_1.PNG");
		Pattern Img2 = new Pattern("C:\\ScreenShot\\Capture_Amol_2.PNG");
		
		Screen screen = new Screen();
		screen.wait(Img1,90);
			
		Actions action = new Actions(driver);
				
		//path of the file which we want to load
		screen.type(Img1,path);// path is excel data path
				
		//screen.dragDrop(Img1,"C:\\Users\\Amol\\Amol.jpeg");
		screen.click(Img2);
		Thread.sleep(2000);
		
		//Save Button
		driver.findElement(By.xpath(object.getProperty("savebutton"))).click();
		
		System.out.println("uploading photo Successfully.... ");
		
		}catch(Throwable t){
			testUtil.captureScreenshot("UploadPhotoTest");
			//Assert.assertTrue(false,t.getMessage());
			
		}
	}
	
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("UploadPhotoTest");// passing parameters to the util.getData()
	}

}
