package xpathExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class XPATHAxisExample  {

	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("closing app");
		Thread.sleep(5000);
		//driver.close();
		// driver.quit();
	}

	
	
	@Test
	public void verifyAmazonScreenshot() throws Exception {

		
		
		WebElement checkbox = driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input[@type='checkbox']"));
		checkbox.click();
		
		
		
		
	}
	
	

	
}
