import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test(priority=1) 
	public void doLogin() throws InterruptedException
	{
		if(driver!=null){
			System.out.println(driver.getTitle());
			//driver.findElement(By.id("email")).sendKeys("amolnagre@rediffmail.com");
			driver.findElement(By.id("emailxyz")).sendKeys("amolnagre@rediffmail.com");
			
			// Locator=Name of Password Button
			driver.findElement(By.name("pass")).sendKeys("@mol123");
			
			//Locator=Xpath of Login Button
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
		}
	}
	
	@Test(priority=2)
	public void composeMail()
	{
		Assert.fail("Error in Composing Mail");
	}

}
