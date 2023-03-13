package locatorExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class LoginTest_TestNG {

	WebDriver driver;
	ReadConfig conf;
	
	@Test
	public void verifyLogin() throws Exception {
		System.out.println("login test case-------testNG");
		

		String email = conf.getEmail();
		
		
		//locator
		//ID
		Thread.sleep(5000);
		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		
		txtEmail.clear();
		
		Thread.sleep(5000);
		txtEmail.sendKeys(email);
		
		
		//get the attribute value of specific element
		System.out.println("Attribute value of email are: " + txtEmail.getAttribute("data-val-required"));
		
		
		
		//Password 
		//name
		
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		
		
		//Login Button
		//Tagname
		
		WebElement btnLogin = driver.findElement(By.tagName("button"));
		
		
		System.out.println("Login Button text are: " + btnLogin.getText());
		
		btnLogin.click();
		
		
		
		Thread.sleep(5000);
		//validation Step
		String actualTitle = driver.getTitle();
		System.out.println("After login application title: " + actualTitle);
		System.out.println("After login application URL: " + driver.getCurrentUrl());
		
		//Dashboard
		
		
		
	}
	
	
	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");
		
		driver = WebDriverManager.chromedriver().create();
		
		conf = new ReadConfig();
		System.out.println("Application URL: " + conf.getApplicationURL());
		
		driver.get(conf.getApplicationURL());
		
		//driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}

	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
	}

}
