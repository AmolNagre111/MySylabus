import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesFourceLoginUsingDatabseTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306"; 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Facebook", "root","@mol1988");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from  LoginInfo where Username='amolnagre'");
		
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			//driver.get("https://www.google.com/");
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			
			// Salesforce Username
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys(rs.getString("Username"));
			//Salesfource password
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(rs.getString("Password"));
			//Salesfource Login Button
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			
			System.out.println(rs.getString("Username"));
			System.out.println(rs.getString("Password"));
			
		}
		
	}

}
