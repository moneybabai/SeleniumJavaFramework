package DemoTestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
	
	
	//we need to use flower brackets if we are giving multiple parameters
	//if we use @optional thenthe string to e entered is not compuslsory, 
	//the test will execute even if we dont enter a value in testng.xml parameter
	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Jaya") String name) {
		
		System.out.println("Name is :"+name);
	}

}
