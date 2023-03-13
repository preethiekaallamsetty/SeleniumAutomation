package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

//import junit.framework.Assert;

public class HandleAlertExample  extends BaseTest{
	

	
	//@Test
	public void verifySimpleAlert() throws Exception {
		
		
		
		//click on Show me Alert button ---- alert generated
		driver.findElement(By.cssSelector("[value=\"Show Me Alert\"]")).click();
		
		
		Thread.sleep(4000);
		//handle an alert
		//Alert/iframe/windows     ------- driver.switchto()
		
		
		Alert simpleAlert = driver.switchTo().alert();
		
		
		
		//action on alert
		//accept ----- click on ok button
		//dismiss ----- click on cancel button
		//getText   ----- get text of alert, validation
		//sendkeys ----- enter value onto alert
		
		
		System.out.println("Alert text: " + simpleAlert.getText());

		//validation step
		
		Assert.assertEquals("Hi.. This is alert message!", simpleAlert.getText());
		
		
		Thread.sleep(4000);
		
		
		//simpleAlert.accept();
		simpleAlert.dismiss();
		
		
	}
	
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
		
		
		
		//click on Show me Alert button ---- alert generated
		driver.findElement(By.cssSelector("[onclick='myFunctionf()']")).click();
		
		
		Thread.sleep(4000);
		//handle an alert
		//Alert/iframe/windows     ------- driver.switchto()
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		//action on alert
		//accept ----- click on ok button
		//dismiss ----- click on cancel button
		//getText   ----- get text of alert, validation
		//sendkeys ----- enter value onto alert
		
		
		System.out.println("Alert text: " + promptAlert.getText());

		//validation step
		
		Assert.assertEquals("Your Name Please", promptAlert.getText());
		
		
		Thread.sleep(4000);
		
		
		String name = "Jathin";
		
		
		//sendKeys
		promptAlert.sendKeys(name);
		
		
		
		
		
		//coonfirmAlert.accept();
		//promptAlert.dismiss();
		
		promptAlert.accept();
		
		
		
		
		
		
		
	}
	
	
	//@Test
	public void verifyConfirmAlert() throws Exception {
		
		
		
		//click on Show me Alert button ---- alert generated
		driver.findElement(By.cssSelector("[onclick='myFunction()']")).click();
		
		
		Thread.sleep(4000);
		//handle an alert
		//Alert/iframe/windows     ------- driver.switchto()
		
		
		Alert coonfirmAlert = driver.switchTo().alert();
		
		
		
		//action on alert
		//accept ----- click on ok button
		//dismiss ----- click on cancel button
		//getText   ----- get text of alert, validation
		//sendkeys ----- enter value onto alert
		
		
		System.out.println("Alert text: " + coonfirmAlert.getText());

		//validation step
		
		Assert.assertEquals("Press 'OK' or 'Cancel' button!", coonfirmAlert.getText());
		
		
		Thread.sleep(4000);
		
		
		//coonfirmAlert.accept();
		coonfirmAlert.dismiss();
		
		
		
		
		
		String actualValidatio_OK_Canel = driver.findElement(By.cssSelector("[id='demo']")).getText();
		
		System.out.println("===============================");
		System.out.println(actualValidatio_OK_Canel);
		System.out.println("===============================");
		Assert.assertEquals("You pressed Cancel!", actualValidatio_OK_Canel);
		
		
		
		
		
		
	}
}
