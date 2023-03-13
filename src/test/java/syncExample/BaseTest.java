package syncExample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//visible of element
		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		//example for alert
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");

		driver.manage().window().maximize();

		//Thread.sleep(5000);
		
		//implicit Wait
		//applicable for any element
		//Scenario: application ------different takes different time to load on page
		//before throwing an exception ---- wait for 20 sec, any element
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
	}

}
