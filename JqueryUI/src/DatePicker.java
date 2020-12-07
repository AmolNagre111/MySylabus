import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;

public class DatePicker {

	/*target day,month,year
	 * current day , month,year
	 * jump to the month
	 *increment or decrement
	 */

	static int targetDay=0;
	static int targetMonth=0;
	static int targetYear=0;
	
	static int currentDay=0;
	static int currentMonth=0;
	static int currentYear=0;
	
	static int jumpMonthsBy=0;
	
	static boolean increment=true;
		
	public static void main(String[] args) throws InterruptedException {
	
		String dateToString="14/01/2020";
		
		//get currentdate
		getCurrendDayMonthYear();
		System.out.println("Curren Date: "+currentDay+"   "+currentMonth+"   "+currentYear);
		
		// get targetdate
		getTargetdDayMonthYear(dateToString);
		System.out.println("Targeted Date: "+targetDay+"   "+targetMonth+"   "+targetYear);
		
		// Jump to months
		HowManyMonthsJump();
		System.out.println("Decrement Months: "+jumpMonthsBy);
		System.out.println("Increment Months: "+increment);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement mainframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(mainframe);// focus on mainframe 
		
		
		//Click on Calendar
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		for(int i=0;i<jumpMonthsBy;i++)
		{
			if(increment)
			{
				//Click on Navigation of Increment/forward button
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
				
			}else
			{
				//Click on Navigation of decrement/Backward button
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
			Thread.sleep(2000);
		}
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
		
		
	}

	public static void getCurrendDayMonthYear()
	{
		Calendar cal = Calendar.getInstance();
		currentDay=cal.get(Calendar.DAY_OF_MONTH);
		currentMonth=cal.get(Calendar.MONTH)+1;
		currentYear=cal.get(Calendar.YEAR);
	}
	
	public static void getTargetdDayMonthYear(String datestring)
	{
		int firstIndex=datestring.indexOf("/");
		int lastIndex=datestring.lastIndexOf("/");
		
		String day=datestring.substring(0,firstIndex);
		targetDay=Integer.parseInt(day);
		
		String month= datestring.substring(firstIndex+1,lastIndex);
		targetMonth=Integer.parseInt(month);
		
		String year= datestring.substring(lastIndex+1, datestring.length());
		targetYear=Integer.parseInt(year);
		
	}
	public static void HowManyMonthsJump()
	{
		if((targetMonth-currentMonth)>0)
		{
			jumpMonthsBy=targetMonth-currentMonth;
		}else
		{
			jumpMonthsBy=currentMonth-targetMonth;
			increment=false;
		}
	}
	
}
