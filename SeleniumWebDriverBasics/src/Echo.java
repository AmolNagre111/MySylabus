import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echo {
	public static void main(String[] args) {
		//Home Work
		
		// retrive all checkbox value
		// and check 2nd checkbox is checked or not
		// and if checked then do unchecked
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		checkbox.get(4).click();
		System.out.println(checkbox.get(4).getText());
		/*
		System.out.println("Total Number Of CheckBox Is: "+checkbox.size());// tells how many checkbox present 
		System.out.println(checkbox.get(0).getAttribute("value"));// print 0th position checkbox
		System.out.println(checkbox.size());
*/		
		
	}

}
