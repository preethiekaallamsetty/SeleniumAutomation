package testNGAnnotationExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExample_Priority {
	
	
	//Priority 
	
	//Default priority ---- 0
	//Highest negative number having highest priority 
	//If priority is same , execution as per naming conv (ASCII value)
	
	
	
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching app");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closeApp ");
	}
	
	
	//Execution workflow
//	launching app
	//	addItems test case
	//	login test case
	//	logout test case
	//	payment test case
//	closeApp 
	
	
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 1)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test
	public void addItems() {
		
		System.out.println("addItems test case");
		
	}
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
		
	}

}
