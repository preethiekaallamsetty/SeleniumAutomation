package testNGAnnotationExample;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample2 {
	
	//pre-condition -----BeforeSuite----> BeforeTest -----> BeforeClass ---->BeforeMethod
	//Test				login/logout
	//post-condition -----AfterSuite<---- AfterTest <----- AfterClass <----AfterMethod
	
	
	
	
	
	@BeforeSuite
	public void setup() {
		
		System.out.println("==============@BeforeSuite================");
		
	}
	
	@AfterSuite
	public void teardown() {
		
		System.out.println("==============@@AfterSuite================");
		
	}
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("==============@@BeforeTest - launchApp================");
		
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("==============@AfterTest - close app================");
		
	}
	
	@Test
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	

}
