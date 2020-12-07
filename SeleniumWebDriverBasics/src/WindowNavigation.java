import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigation {

	public static void main(String[] args) throws InterruptedException {
		//
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Xpath of Business (Link) which is at bottom side of the page.
		driver.findElement(By.xpath("//*[@id='fsl']/a[2]")).click();
		Thread.sleep(1000L);
		driver.navigate().back();
		Thread.sleep(1000L);
		driver.navigate().forward();
		
		

	}

}
