package ibm_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ibm_pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	
	WebDriver driver;
	LoginPage lp;
	ReadConfig conf;
	
	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching app");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		conf = new ReadConfig();
		
		driver.get(conf.getApplicationURL());

		driver.manage().window().maximize();
		
		//create an object of Pages
		
		
		lp = new LoginPage(driver);
		
		
		
		

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
