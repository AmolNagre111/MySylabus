import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	// POM--> Page Object Model
	// There are two types
	//1. Page Object Factory
	//2. Page Object Pattern
	
	
		
	//1. 1st Way Using Page Object Factory
	/*
	WebDriver driver;
	
	public FaceBookLoginPage(WebDriver driver){ // creating a costructor for page object factory
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 //1st way Using Page Object Factory
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement username;
	
	@FindBy(xpath="//*[@id='pass']")
	public WebElement password;
	
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement login;
	
	
	public void EnterUsername()
	{
		username.sendKeys("9970814338");// sending username of FB
	}
	
	public void EnterPassword()
	{
		password.sendKeys("Amol@1988");// sending username of FB
	}
	
	public void ClickOnLoginButton()
	{
		login.click();
	}

*/	


	
	
	
	// 2nd Way Using Page Object Pattern

	
	WebDriver driver;
	
	public FaceBookLoginPage(WebDriver driver){
	this.driver=driver;
}
	
		By username = By.xpath("//*[@id='email']");
		
		By password = By.xpath("//*[@id='pass']");
		
		By login = By.xpath("//*[@value='Log In']");
		
 
	 
	
	public WebElement email()
	{
		return driver.findElement(username);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
}
