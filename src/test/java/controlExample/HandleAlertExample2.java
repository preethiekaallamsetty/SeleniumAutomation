package controlExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import junit.framework.Assert;

public class HandleAlertExample2  {

	WebDriver driver;

	@Before
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Switchto");

		//driver.manage().window().maximize();

		Thread.sleep(5000);

	}

	@After
	public void closeApp() throws Exception {

		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
	}

	@Test
	public void verifyPromptAlert() throws Exception {

		// click on Show me Alert button ---- alert generated
		driver.findElement(By.cssSelector("[id=prompt]")).click();

		Thread.sleep(4000);
		// handle an alert
		// Alert/iframe/windows ------- driver.switchto()

		Alert promptAlert = driver.switchTo().alert();

		// action on alert
		// accept ----- click on ok button
		// dismiss ----- click on cancel button
		// getText ----- get text of alert, validation
		// sendkeys ----- enter value onto alert

		System.out.println("Alert text: " + promptAlert.getText());

		// validation step

		Assert.assertEquals("Enter your name", promptAlert.getText());

		Thread.sleep(4000);

		//String name = "Jathin";
		String name = "Jeny Jean";
		// sendKeys
		promptAlert.sendKeys(name);

		// coonfirmAlert.accept();
		// promptAlert.dismiss();

		promptAlert.accept();

		String actualValidatio_OK_Canel = driver.findElement(By.cssSelector("[id='demo']")).getText();

		System.out.println("===============================");
		System.out.println(actualValidatio_OK_Canel);
		System.out.println("===============================");
		//Assert.assertEquals("You pressed Cancel!", actualValidatio_OK_Canel);

		Assert.assertTrue(actualValidatio_OK_Canel.contains(name));
		
	}

}
