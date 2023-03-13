package unitTestExample;

//import org.testng.annotations.Test;
//import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest_TestNG {

	// Pre-condition ----- @BeforeSuite -----BeforeTest ----BeforeClass ----BeforeMethod
	// Test
	// Post-condition ----- @AfterSuite -----AfterTest ----AfterClass ----AfterMethod

	

	@Test
	public void verifyLogin() {
		System.out.println("login test case-------testNG");
	}
	
	
	@BeforeTest
	public void launchApp() {

		System.out.println("launching app");
	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing app");
	}

}
