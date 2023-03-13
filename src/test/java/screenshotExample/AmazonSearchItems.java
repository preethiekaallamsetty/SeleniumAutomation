package screenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AmazonSearchItems extends BaseTest {

	@Test
	public void verifyAmazonScreenshot() throws Exception {

		
		
		driver.findElement(By.cssSelector("[id=twotabsearchtextbox]")).sendKeys("iphone 14 pro max");
		driver.findElement(By.cssSelector("input[value=Go]")).click();
		
		
		
		//validation step
		Assert.assertTrue(driver.getTitle().contains("iphone 14"));
		
		
		//get screenshot
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		File targetLocation =  new File(".\\ibm_screenshot\\AmaoznSearchItem.png");
//		
//		
//		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
		getScreenshot(driver, "iphone 14 pro max");

		
		
	}
	
	

	
}
