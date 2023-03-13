package unitTestExample;

import org.junit.After;
import org.junit.Before;
//import org.testng.annotations.Test;
import org.junit.Test;

public class LoginTest_Junit {

	// Pre-condition ----- @Before
	// Test
	// Post-condition ----- @After

	

	@Test
	public void verifyLogin() {
		System.out.println("login test case");
	}
	
	
	@Before
	public void launchApp() {

		System.out.println("launching app");
	}

	@After
	public void closeApp() {
		System.out.println("closing app");
	}

}
