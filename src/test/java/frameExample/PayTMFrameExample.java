package frameExample;

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



public class PayTMFrameExample  {

	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://paytm.com/");

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
	public void verifyPayTMFrame() throws Exception {

		
		
		WebElement btnSignIn = driver.findElement(By.xpath("//span[contains(text(),'gn')]"));
		
		
		//app1
		
//		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("arguments[1].click();", btnSignIn);
		
		
		//app2
		btnSignIn.click();
		
		
		//Alert/frame/window      ------- driver.switchTo()
		
		//handle frame
		//index ----- start from 0
		//name/id
		//WebElement 
		
		
		
		//driver.switchTo().frame(0);
//		driver.switchTo().frame("name/id");
		
		
		WebElement payTMFrame = driver.findElement(By.cssSelector("iframe[src*='login']"));
		//WebElement payTMFrame1 = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(payTMFrame);
		
		
		
		//Thread.sleep(7000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 120);      //maximum duration--- 120 , event ---- throw exception
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'gn')]")));
//		
//		
		
		
		
		String payTMFrameHeading = driver.findElement(By.cssSelector(".heading")).getText();
		
		System.out.println("Frame heading: " + payTMFrameHeading);
		
		Assert.assertTrue(payTMFrameHeading.contains("Paytm Web account"));
		
		
		//click on Watch Video
		driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();
		
		
//		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(),'Watch')]")));
		
	}
	
	
	@Test(enabled = false)
	public void verifyPayTMFrame2() throws Exception {

		
		
		WebElement btnSignIn = driver.findElement(By.xpath("//span[contains(text(),'gn')]"));
		
		
		//app1
		
//		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("arguments[1].click();", btnSignIn);
		
		
		//app2
		btnSignIn.click();
		
		
		//Alert/frame/window      ------- driver.switchTo()
		
		//handle frame
		//index ----- start from 0
		//name/id
		//WebElement 
		
		
		
		//driver.switchTo().frame(0);
//		driver.switchTo().frame("name/id");
		
		
		WebElement payTMFrame = driver.findElement(By.cssSelector("iframe[src*='login']"));
		//WebElement payTMFrame1 = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(payTMFrame);
		
		
		
		//Thread.sleep(7000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 120);      //maximum duration--- 120 , event ---- throw exception
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'gn')]")));
//		
//		
		
		
		
		String payTMFrameHeading = driver.findElement(By.cssSelector(".heading")).getText();
		
		System.out.println("Frame heading: " + payTMFrameHeading);
		
		Assert.assertTrue(payTMFrameHeading.contains("Paytm Web account"));
		
		
		//click on Watch Video
		driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();
		
		
//		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(),'Watch')]")));
		
	}
	

	
}
