package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputboxMultipleMatch  extends BaseTest{
	

	
	@Test
	public void verifyInputbox() {
		
		
		//driver.findElement(By.xpath("//input")).sendKeys("enter username");				//mutiple match --- 14, perform action on first element
		
		driver.findElement(By.tagName("input")).sendKeys("enter username");
	}
}
