package logExample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	public WebDriver driver;
	public ReadConfig conf;
	public Logger log;

	@BeforeTest
	public void launchApp() throws Exception {

		
		
		//logging configuration
		
		log = Logger.getLogger("NOP comm application module");
		PropertyConfigurator.configure(".\\data\\ibm_log4j.properties");
		
		
		log.info("===========information==============");
		log.warn("===========information==============");
		log.error("===========information==============");
		
		log.info("launching a chrome browser");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
		
		conf = new ReadConfig();
		
		log.info("launching application url: " +conf.getApplicationURL());
		
		
		driver.get(conf.getApplicationURL());

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeApp() throws Exception {

		log.info("closing an application");
		Thread.sleep(5000);
		driver.close();
		// driver.quit();
	}

	public void getScreenshot(WebDriver driver, String screenshotName) throws Exception {

		
		log.info("============Capturing a screenshot=================");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetLocation = new File(".\\ibm_screenshot\\Amaozn_"+     screenshotName +  "_.png");
		
		//Amaozn_iphone 14 pro max_.png

		FileUtils.copyFile(screenshotFile, targetLocation);
		
		log.info("Screnshot location: " + targetLocation);

	}
}
