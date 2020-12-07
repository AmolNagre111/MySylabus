import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		//Learning How to Handle Multiple Windows
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Gmail.com
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//xpath of Help Which is at the bottom
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
				
		System.out.println(driver.getTitle());// title of Gmail due to not switch window
		
		System.out.println("After new tab or child window is Opened");
		
		Set<String> ids = driver.getWindowHandles();// set ids of window 
		
		Iterator<String> iterate = ids.iterator(); 
		
		String parentids = iterate.next();
		String childids = iterate.next();
				
		driver.switchTo().window(childids);
		System.out.println(driver.getTitle());
		
		//xpath of google account which is at top-right side of window.
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[4]/div/div/div/div[2]/span/a/span")).click();
		
		System.out.println("After new sub-Child Window is Opened");
		ids=driver.getWindowHandles();
		iterate=ids.iterator();
		
		//System.out.println(iterate.next());
		//System.out.println(iterate.next());
		
		iterate.next();
		iterate.next();
		
		String subchild_id=iterate.next();// move focus to the subchild_id
		
		System.out.println("Id of SubChild Window: "+subchild_id);// print subchild_id 
		
		driver.switchTo().window(subchild_id);// swith to childids to subchild_id
		
		System.out.println(driver.getTitle());// get current window title i.e subchild_id
		
		Thread.sleep(4000L);
		driver.close();// close current window that is subchild_id
		
		driver.switchTo().window(childids);
		Thread.sleep(4000L);
		driver.close();// close current window that is childids
		
		Thread.sleep(4000L);
		driver.switchTo().window(parentids);
		driver.close();
		

		//driver.quit();  close all windows in a single method 
		
		/*
		 * 
		 */
 		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
