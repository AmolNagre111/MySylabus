import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
////
public class MultiWindowExample {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//http://the-internet.herokuapp.com/
		driver.navigate().to("http://the-internet.herokuapp.com/");
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Set<String> ids = driver.getWindowHandles();// set ids of window
		ids=driver.getWindowHandles();
		Iterator<String> iterate = ids.iterator();
		
		Thread.sleep(3000L);
		
		
		
		//xpath of Multiple Windows is at the bottom --> click on Multiple windows Link
		//Xpath of Multiple Windows 2 Types==> (1) //a[contains(text(),'Multiple Windows')] or (2)//a[@href='/windows']
		//(3) //*[@id="content"]/ul/li[33]/a
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		Thread.sleep(3000L);
		
		// Then Click on Click Here Links-->
		//xpath of Click Here Links==> (1) //a[@href='/windows/new'] or (2) //a[contains(text(),'Click Here')]
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		// Print Title of third Windows==> Xpath--> //h3[contains(text(),'New Window')]
		//driver.findElement(By.tagName("h3")).getText();
		driver.getTitle();
		
		

	}

}
