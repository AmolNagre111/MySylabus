import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWaitInClass {

	public static void main(String[] args) throws InterruptedException {
		//Ajax based elements
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1) PageLoad Timeout
		//driver.manage().timeouts().pageLoadTimeout(10L,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		//2)Implicit wait-Global Wait
		//Implicit Wait-Global wait (Written only once but applied whenever it sees driver.findElements)
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		//Thread.sleep(2000);
		
		//3)Explicitly wait
		// Explicitly wait is used for particulars of the web site searching time. 
		//System.out.println("----------- WebDriver Wait---------------------");
		/*Class WebDriverWait is used for Explicit Wait
		 * Explicit Classes-1) WebDriverWait and 2) FluentWait
		 * WebDriverWait is SubClass of FluentWait or FluentWait is Extended from WebDriverWait
		 */
		
		
	//i) WebDriverWait wait = new WebDriverWait(driver, 10L);// Maximum waiting time is 10 Second
		
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[2]/div[2]/ul/li[8]/div"))).click();
		
	//ii) FluentWait
		System.out.println("-------- Fluent Wait --------");
		//Waiting 10 second for an element to be present on the page, checking
		//for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.withMessage("User Defined Wait timed out after 10 second");
		
		//Correct Xpath
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[2]/div[2]/ul/li[8]/div")).click();
		
		//Incorrect Xpath
		//driver.findElement(By.xpath("")).click();
		
		
	}

}
