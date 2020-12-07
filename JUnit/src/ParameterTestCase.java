import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Parameterization in JUnit Standard steps

//First Step
@RunWith(Parameterized.class)

public class ParameterTestCase {

	// Second step- defingin Parameres
	String firstname;
	String lastname;
	String password;
	int age;
	
	//Third step Constuctor of a class
	public ParameterTestCase(String firstname,String lastname,String password,int age)
	{
		//Assign parameter values to local variables
		this.firstname=firstname;
		this.lastname=lastname;
		this.password=password;
		this.age=age;
	}
	
	//Fourth step
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][4];
		
		// First Row
		data[0][0]= "Amol";
		data[0][1]= "Nagre";
		data[0][2]= "@mol";
		data[0][3]= 32;
		
		//Second Row
		data[1][0]= "mangesh";
		data[1][1]= "Sontakke";
		data[1][2]= "M@ngesh";
		data[1][3]= 28;
		
				
		return Arrays.asList(data);
	}
	// Fifth step
	@Test
	public void doLogin(){
		
		System.out.println(firstname+"  "+lastname+"   "+password+"   "+age);
	}
	
}
