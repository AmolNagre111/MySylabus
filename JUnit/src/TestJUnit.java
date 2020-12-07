import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {
	
	// Java Frameworks- 1> JUnit And 2> TestNG
	
	//TestCase Annotation
	//JUnit Annotation
	/* 1.@Test
	 * 2.@Before
	 * 3.@After
	 * 4.@BeforeClass
	 * 5.@AfterClass
	 * @Ignore
	 */

	public static boolean dbConnection()
	{
		return true;
	}
	
	
	// BeforeClass Annotation will be called before 'Before' annotation and before calling
	// any testcase (It Will be called only Once)
	@BeforeClass
	public static void SeleniumSetup(){
		System.out.println("Intalling Selenium Server");
		Assume.assumeTrue(dbConnection());
	}
	
	@Before// Before Annotation is called before executing every Test Cases
	public void testOpenBrowser()
	{
		System.out.println("Opening FireFox Browser");
	}
	@After// After Annotation is called after calling each and every testcase 
	public void testCloseBrowser()
	{
		System.out.println("Clossing FireFox Browser");
	}
	
	
	@Test
	
	public void testNavigation()
	{
		System.out.println("Opening the Website");
	}
	
	// Ignore Annotation will be used to ignore or skip the excution of any testcase
	//@Ignore
	@Test
	public void testLoginDetails()
	{
		System.out.println("Enter Login Details");
	}
	
	// AfterClass Annotation will be called after all testcase executing
    @AfterClass
    public static void SeleniumShutDown()
    {
    	System.out.println("Shtutting Down Selenium Server");
    }
	

}
