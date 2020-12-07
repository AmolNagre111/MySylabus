import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRadioButton {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504235901%7Ce%7Cfacebook%7C&placement=&creative=318504235901&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9040229%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvNCE7bv25wIVFoyPCh3jLAhBEAAYASAAEgLDhfD_BwE");
		driver.manage().window().maximize();
		
		List <WebElement> radiobutton = driver.findElements(By.name("sex"));
	
		
		System.out.println("Total Number Of CheckBox Is: "+radiobutton.size());
		System.out.println(radiobutton.get(0).getAttribute("value"));
		System.out.println(radiobutton.size());
		
		for(int i=0;i<radiobutton.size();i++)
		{
			System.out.println(radiobutton.get(i).getAttribute("value"));
		}
		System.out.println("Example :"+6/2*(1+2));
		
		
		//===>    //input[@id='u_0_6']
		

	}

}
