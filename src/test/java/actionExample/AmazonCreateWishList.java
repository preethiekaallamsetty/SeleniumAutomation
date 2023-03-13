package actionExample;

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
	public void verifyPayTMFrame() throws Exception {

		
		
		WebElement btnSignIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement wishList = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		
		
		Actions act = new Actions(driver);
		
		
		//act.moveToElement(btnSignIn).perform();
		
		act.moveToElement(btnSignIn).click(wishList).perform();
	}
	

	
}
