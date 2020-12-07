package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");// taking from config.properties file if we want to any changes do there
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		//click on google apps button
		//Login Gmail first
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anagre77@gmail.com");
		//click on next
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(6000);
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@mol1988");
		//click on compose button
		
		//driver.findElement(By.linkText("Compose")).click();
/*
		driver.switchTo().frame(0);// focus on particular block or frame
		//System.out.println(frame.getText());
		
		driver.findElement(By.linkText("Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")).click();
		Thread.sleep(3000);
		String actual = driver.getTitle();
		System.out.println("ActualTitle: "+actual);
		String expected = "Google Account";
		System.out.println("Title: "+expected);
		Assert.assertEquals(actual, expected);
		System.out.println("Both title are same");
		//System.out.println("Verify Google Account App");
		driver.navigate().back();
		
		Thread.sleep(4000);
	*/	driver.close();
		
	}
}

/*WebElement link=driver.findElement(By.xpath("//*[@class='j1ei8c']"));//Xpath of particular dropdown list
		System.out.println(link.getSize());
		System.out.println(link.getText());
		List <WebElement> links=link.findElements(By.tagName("option"));// use option in particular dropdown list
		
		//WebElement str1 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li["));
		//WebElement str2 = driver.findElement(By.xpath("]/a/div/span"));
		String str1="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
		String str2 = "]/a/div/span";
		for(int i=0;i<links.size();i++)
		{
			
			String result=(str1)+(i)+(str2);
			driver.findElement(By.xpath(result)).click();
			System.out.println(result);
			System.out.println(driver.getTitle());
		}
 * 
 */

