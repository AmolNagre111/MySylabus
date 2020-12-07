import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButton {

	public static void main(String[] args) throws InterruptedException {
		//Learning Radio Buttons
		// for checking Radio Button == facebook.com and spicejet.com
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.html.am/html-codes/forms/");
		
		
		List<WebElement> radiobutton=driver.findElements(By.name("color"));// in all radio button name is common

		System.out.println("Number of Radio Buttons Are: "+radiobutton.size());//printing of number of buttons
		
		System.out.println(radiobutton.get(1).getAttribute("value")); //op== GREEN-> Values are differents
		
		for(int i=0;i<radiobutton.size();i++)
		{
			System.out.println(radiobutton.get(i).getAttribute("value"));
		}
		
		// Checking whether radio button is checked or not
		
		System.out.println("==============================================================");
		
		System.out.println("Checking whether radio button is checked or not...");
		
		System.out.println(radiobutton.get(0).getAttribute("checked"));// return null because not checked
		radiobutton.get(0).click();// actual checked or click on the button
		System.out.println(radiobutton.get(0).getAttribute("checked"));// return true
		
		Thread.sleep(3000);
		//driver.close();
		
	}

}
