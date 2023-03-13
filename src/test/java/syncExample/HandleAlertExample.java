package syncExample;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class HandleAlertExample  extends BaseTest{
	

	
	@Test
	public void verifyConfirmAlert() throws Exception {
		
		
		//hard coded delay
		//increase your execution time
		//Thread.sleep(20000);  
		
		
		//ExplicitWait
		//Conditional Wait
		//Specific condition to happen ------ specific element
		
		WebDriverWait wait = new WebDriverWait(driver, 120);      //maximum duration--- 120 , event ---- throw exception
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
