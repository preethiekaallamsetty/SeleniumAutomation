package exercise;

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




public class ModalExample  {

	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Switchto");

		//driver.manage().window().maximize();

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
	public void verifyAmazonScreenshot() throws Exception {

		
		
		WebElement btnLaunchModal = driver.findElement(By.cssSelector("button[data-target='#myModal']"));
		WebElement btnPrompt = driver.findElement(By.cssSelector("button[id=\"prompt\"]"));
		
		//click operaton using javascript
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[1].click();", btnPrompt, btnLaunchModal);
		
		
		
		//sync issue
		//Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, 120);      //maximum duration--- 120 , event ---- throw exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-title")));
		
		
		//perform action ---- dailog
		//switchTo
		
		
		//get the text from dailog
		
		String Heading = driver.findElement(By.cssSelector(".modal-title")).getText();
		String body = driver.findElement(By.cssSelector(".modal-body")).getText();
		
		System.out.println("heading: " + Heading);
		System.out.println("body: " + body);
		
		Assert.assertEquals(Heading, "Modal window demo");
		Assert.assertTrue(body.contains("using the parent application"));
		
		
		//click on Ok button
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		
		
	}
	
	

	
}
