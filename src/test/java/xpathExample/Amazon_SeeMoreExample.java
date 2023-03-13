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




public class Amazon_SeeMoreExample  {

	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

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
	public void verifyAmazonScreenshot() throws Exception {

		
		
		WebElement linkSeeMore = driver.findElement(By.xpath("//h2[contains(text(),'Automotive essentials')]//parent::div//following-sibling::div[contains(@class, 'foot')]//child::a[text()='See more']"));
		linkSeeMore.click();
		
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Car & Motor"));
		
	}
	
	

	
}
