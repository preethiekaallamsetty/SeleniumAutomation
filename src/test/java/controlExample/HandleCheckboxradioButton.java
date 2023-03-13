package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleCheckboxradioButton  extends BaseTest{
	

	
	@Test
	public void verifyInputbox() {
		
		
		//checkbox
		driver.findElement(By.xpath("//input[@value=\"Boat\"]")).click();
		
		
		
		//checkbox
		driver.findElement(By.cssSelector("input[value='female']")).click();
		
		
	}
}
