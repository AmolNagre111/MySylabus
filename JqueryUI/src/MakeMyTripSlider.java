import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-12/10/2020&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='section--wrapper']/div[1]/div[2]/div/div/div/div/div/div[4]"));
		System.out.println("Sliding Elements");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, -90, 0).perform();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		
		driver.close();
		//Assingmnets
		//Selectable
		//sortable
		//hide
		//

	}

}
