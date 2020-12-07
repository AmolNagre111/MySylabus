import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class LearningAssertions {

	@Rule
	public ErrorCollector ec= new ErrorCollector();
	
	
@Test
public void testTitle()
{
	String actual_title="Google.com";// Extract it from Selenium Script
	String expected_title="Google.inc";// Compare this title from excel sheet
	
	System.out.println("Start Comparision");
	try{
	Assert.assertEquals(actual_title, expected_title);
	}catch(Throwable t){
		System.out.println("Error Occured");
		ec.addError(t);// for reporting Error
	}
	System.out.println("Comparision Done");
	
	/*if(actual_title==expected_title)
	{
		System.out.println("Test is Passed");
	}else
		System.out.println("Test is Failed");*/
}
	
	
	
}
