package testNGAnnotationExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExample {
	
		
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching app");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closeApp ");
	}
	
	
	@Test(priority = -100, description = "verify login feature of amazon application")
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 1, dependsOnMethods = "login")
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(description = "verify add Items feature of amazon application")
	public void addItems() {
		
		System.out.println("addItems test case");
		
		//failed a add item test
//		int x = 1/0;
		
		Assert.assertTrue(true, "Validation of add items get failed.");
		
		
	}
	
	@Test(dependsOnMethods = "addItems")
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	
	@Test(dependsOnMethods = "addItems")
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}

}
