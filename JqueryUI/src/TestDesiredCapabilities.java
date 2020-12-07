import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestDesiredCapabilities {

	public static void main(String[] args) {
		// Internet Explorer
		
	 DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
	 
	 System.setProperty("webdriver.ie.driver","C:\\Selenium WebDrivers\\IEDriverServer.exe");
	 
	 cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
	 
	 cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	 
	 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	 
	 WebDriver driver = new InternetExplorerDriver(cap);
	 
	 driver.get("https://www.google.co.in/");
		

	}

}
