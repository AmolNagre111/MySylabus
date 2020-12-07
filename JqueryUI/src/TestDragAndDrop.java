import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// Using Jquery Perform Drag and Drop the WebElemet
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		WebElement dragable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		System.out.println("Drag and Drop the Elements");
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(dragable, droppable).perform();
		
		Thread.sleep(5000);	
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
