import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadPhotoPage {
	
	/*#upload photo
uploadphotopath1=//span[text()='Amol']
uploadphotopath2=//a[text()='Update']
uploadphotopath3=//a[@aria-label='Upload Photo']
savebutton=//button[text()='Save' and @value='1']
	 * 
	 */

WebDriver driver;
	
	public UploadPhotoPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="//span[text()='Amol']")
	public WebElement clickProfileBtn;
	
	@FindBy(xpath="//a[text()='Update']")
	public WebElement clickUpdatBtn;
	
	@FindBy(xpath="//a[@aria-label='Upload Photo']")
	public WebElement clickUploadPhotoBtn;
	
	@FindBy(xpath="//button[text()='Save' and @value='1']")
	public WebElement savebutton;
	
	public void clickProfileButton()
	{
		clickProfileBtn.click();
	}
	
	public void clickUpdateButton()
	{
		clickUpdatBtn.click();
	}
	
	public void clickUploadPhotoButton() throws FindFailed, InterruptedException
	{
		clickUploadPhotoBtn.click();
	}
	
	public void saveButton() throws FindFailed, InterruptedException
	{
		clickUploadPhotoBtn.click();
	
    Screen screen = new Screen();
	
    Pattern Img1 = new Pattern("C:\\ScreenShot\\Capture_Amol_1.PNG");
	Pattern Img2 = new Pattern("C:\\ScreenShot\\Capture_Amol_2.PNG");
	
		
		//Actions action = new Actions(driver);
		screen.wait(Img1,20);
		
		//path of the file which we want to load
		screen.type(Img1,"C:\\Users\\Amol\\Desktop\\BJPRali.jpg");
				
		//screen.dragDrop(Img1,"C:\\Users\\Amol\\Amol.jpeg");
		screen.click(Img2);
		Thread.sleep(2000);
	
		savebutton.click();
	}
}
