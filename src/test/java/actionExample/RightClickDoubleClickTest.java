package actionExample;


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

public class RightClickDoubleClickTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

	}

	
	
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		driver.close();
		// driver.quit();

	}
	
	@Test
	public void RightClicktest() throws Exception {

		
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		
		
		Actions act = new Actions(driver);
		
		
		//right click  --contextClick
		
		act.contextClick(rightClickButton).perform();
		
		deleteButton.click();
		
		System.out.println("Alert text: " + driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		
	}
	
	
	@Test
	public void DoubleClicktest() throws Exception {

		
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		
		Actions act = new Actions(driver);
		
		
		//right click  --contextClick
		
		act.doubleClick(doubleClickButton).perform();
		
		
		
		
		System.out.println("Alert text: " + driver.switchTo().alert().getText());
		
		
		Assert.assertTrue(driver.switchTo().alert().getText().contains("double clicked"));
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
