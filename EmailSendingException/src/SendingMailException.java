import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingMailException {

	public static void main(String[] args) throws IOException, MessagingException {
		// TODO Auto-generated method stub

		// captured ScreenShots in case of an error
				System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();

				SendMailUsingAuthentication mail=new SendMailUsingAuthentication();
				
						driver.get("https://www.facebook.com/");
			
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				// xpath of email & name of facebook page ==> //*[@name='email']
				
				//Initial Code for Capturing Screen shots
				File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				try{
					//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("AMol Nagre");// correct xpath
					driver.findElement(By.xpath("//*[@name='aaaa']")).sendKeys("AMol Nagre");// incorrect xpath
				}catch(Exception e)
				{
					FileUtils.copyFile(scrFile, new File("C:\\CapturedScreenShots\\error1.jpg"));
					mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
					//mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt,SendMailUsingAuthentication.emailMsgTxt);
					System.out.println("Screen Shots Captured Successfully.....");
				}
				
	}

}
