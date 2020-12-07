import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		System.out.println("Resize Elements");
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(resize, 400, 200).perform();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
