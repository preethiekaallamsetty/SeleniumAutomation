package locatorExample;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class NOPCommLogin {

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
		
		//clear the value form email input box
		txtEmail.clear();
		
		Thread.sleep(5000);
		txtEmail.sendKeys(email);
		
		
		//get the attribute value of specific element
		System.out.println("Attribute value of email are: " + txtEmail.getAttribute("data-val-required"));
		
		
		
		//Password 
				
		//className
		driver.findElement(By.className("password")).clear();
		driver.findElement(By.className("password")).sendKeys("admin");
		
		
		//name
		//checkbox
		
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(5000);
		System.out.println("Attribute value of checkbox: "  +driver.findElement(By.name("RememberMe")).getAttribute("type"));
		
		
			
		//Login Button
		//Tagname
		
		WebElement btnLogin = driver.findElement(By.tagName("button"));
		System.out.println("Login Button text are: " + btnLogin.getText());				//Log in
		
		btnLogin.click();
		
		Thread.sleep(5000);
		
		
		//validation Step
		String actualTitle = driver.getTitle();
		System.out.println("After login application title: " + actualTitle);
		System.out.println("After login application URL: " + driver.getCurrentUrl());
		
		//Dashboard
		
		
		//click on Logout button
		//linkText
		
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
		//click on Logout button
		//partialLinkText
				
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		
		Thread.sleep(5000);
		System.out.println("After logout application title: " + driver.getTitle());
		System.out.println("After logout application URL: " + driver.getCurrentUrl());
		
		
		
		
		
		//Locator 
		//XPATH
		//click on Login button using xpath
		//tagname      or    //tagname[@att='value']     or    //tagname[@att="value"]    or     //*[@att='value']
		
//		driver.findElement(By.xpath("//button")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		
		
		
		
		
		//CSS
		//click on Login button using CSS
//		tagname      or    tagname[att='value']     or    tagname[att="value"]    or     [att='value']
		
//		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		
		
		
		
		
		Thread.sleep(5000);
		//findElements --- list of WebElement
		
		
		String dashBoardText = driver.findElements(By.tagName("a")).get(1).getText();   //10
		
		System.out.println("====================: " +dashBoardText);
//		for (int i = 0; i < 10; i++) {
//			
//			
//			
//		}
//		
//		List<WebElement> all_H1Tags = driver.findElements(By.xpath("//h1"));
//		
//		System.out.println("count : " + all_H1Tags.size());
//
//		all_H1Tags.get(1).getText();					//Dashboard
//		System.out.println("After login verify Dashboard text : " + all_H1Tags.get(1).getText());
		
		
		Thread.sleep(5000);
		//click on Logout button
		//partialLinkText
						
		driver.findElement(By.partialLinkText("ogo")).click();
		
		
	}
	
	
	@Before
	public void launchApp() throws Exception {

		System.out.println("launching app");
		
		driver = WebDriverManager.chromedriver().create();
		
		conf = new ReadConfig();
		System.out.println("Application URL: " + conf.getApplicationURL());
		
		driver.get(conf.getApplicationURL());
		
		//driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
	}

	@After
	public void closeApp() throws Exception {
		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
	}

}
