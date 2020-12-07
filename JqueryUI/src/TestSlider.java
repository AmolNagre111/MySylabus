import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		System.out.println("Sleding Elements");
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 90, 0).perform();
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
