import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) throws InterruptedException {
		//Learning 
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.html.am/html-codes/forms/html-radio-button-code.cfm");
		driver.manage().window().maximize();
		
		List <WebElement> checkbox = driver.findElements(By.name("fruit"));// in all checkbox have same name or common elements
		// save 3 elements in checkbox WebElements.
		
		System.out.println("Total Number Of CheckBox Is: "+checkbox.size());// tells how many checkbox present 
		System.out.println(checkbox.get(0).getAttribute("value"));// print 0th position checkbox
		System.out.println(checkbox.size());
		
		for(int i=0;i<checkbox.size();i++)
		{
			System.out.println(checkbox.get(i).getAttribute("value"));
		}
		
		// Checking whether CheckBox is checked or not
		
				System.out.println("==============================================================");
				
				System.out.println("Checking whether Check Box is checked or not...");
				
				System.out.println(checkbox.get(0).getAttribute("checked"));
				//checkbox.get(0).click();// actual checked or click on the button
				System.out.println(checkbox.get(0).getAttribute("checked"));
		
				for(int i=0;i<checkbox.size();i++)
				{
					//checkbox.get(0).click();
					checkbox.get(i).click();
				}
				
				
				Thread.sleep(3000);
				//driver.close();
		
		

	}

}
