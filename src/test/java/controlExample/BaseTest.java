package controlExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@Before
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

	}

	@After
	public void closeApp() throws Exception {

		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
	}

}
