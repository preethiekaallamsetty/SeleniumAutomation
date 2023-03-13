package ibm_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {

	
	
	
	@Test
	public void verifyLogin() throws Exception {

		
		//validation of application Title before Login
		
		lp.verifyApplicationTitle("Your store. Login");
		
		
		
		lp.enterEmail(conf.getEmail());
		lp.enterPass(conf.getPassword());
		lp.clickCheckbox();
		lp.clickLoginButton();
		
		
		//lp.login(conf.getEmail(), conf.getPassword());
		
	
		//validation of application Title after Login
		
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		lp.clickLogoutButton();
		
	}
	

	
}
