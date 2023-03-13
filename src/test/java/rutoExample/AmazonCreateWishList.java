package rutoExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AmazonCreateWishList  {

	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
	}

	
	
	@Test
	public void verifyLogin() throws Exception {

		
		driver.findElement(By.id("Email")).sendKeys("values to send");
		
		driver.findElement(By.cssSelector("input#Password")).sendKeys("values to send");
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		
	}
	

	
}
