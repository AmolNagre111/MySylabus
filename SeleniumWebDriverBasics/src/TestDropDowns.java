import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.jar.asm.Opcodes;

public class TestDropDowns {
	//Learning Drop Down List....
	// Recognized Drop Down List is Select Tag is coplesory
	public static void main(String[] args) {
		// Learning Web Elements 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikibooks.org/");
		driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
/*		
		Select select=new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByValue("fa");
		select.selectByIndex(4);
		//select.selectByVisibleText("Dansk");

		List <WebElement> option=select.getOptions();
		
		System.out.println("The Total number of elements in DropDown List: "+option.size());
		
		// Display elements of DropDown List
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
			System.out.println(option.get(i).getAttribute("lang"));
			System.out.println(option.get(i).getAttribute("value"));
		}
		*/

		/*
		List<WebElement> op=driver.findElements(By.tagName("opotion"));
		System.out.println("The Total number of elements in DropDown List: "+op.size());
		
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getAttribute("lang"));
		}
		*/
	
		
		/*
		// display all links on page
		System.out.println("------------------------------------------------");
		System.out.println("Printing All Links On A Web Page............");
		//driver.findElement(By.tagName("a"));
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links On Web Pages are: "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//System.out.println("By TagName:   "+links.get(i).getTagName());
			
			System.out.println(links.get(i).getAttribute("href"));
		}
	*//*	
		WebElement block=driver.findElement(By.xpath("//*[@id='www-wikibooks-org']/div[8]"));// find particular xpath of block
		
		List <WebElement> links=block.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
			//System.out.println("By TagName:   "+links.get(i).getTagName());
			//System.out.println(links.get(i).getAttribute("href"));
		}
		System.out.println("Total Links in Blocks Are: " + links.size());
		
		*/
		
		// How to find in multiple dropdown list of Particular dropdown list
		
WebElement dropdown=driver.findElement(By.xpath("//*[@id='searchLanguage']"));//Xpath of particular dropdown list
		
		List <WebElement> links=dropdown.findElements(By.tagName("a"));// use option in particular dropdown list 
		System.out.println("Total No. Of Elements in Particular DropDown List: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
			//System.out.println("By TagName:   "+links.get(i).getTagName());
			//System.out.println(links.get(i).getAttribute("href"));
		}
		System.out.println("Total DropDown on Web Pages Are: " + links.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
