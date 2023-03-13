package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownExample  extends BaseTest{
	

	
	//@Test
	public void verifyDropDown() throws Exception {
		
		
		WebElement carlist = driver.findElement(By.xpath("//select"));					//match ---3  , first one		
		
		
		
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html
		//Select class
		
		Select list = new Select(carlist);
		
		
		System.out.println("is listbox accept multiple selection or not: " + list.isMultiple());					//false
		
		
		
		
		
		
		Thread.sleep(2000);
		
		//Selection Methods
		//indexing start from 0
		
		list.selectByIndex(1);						//SAAB
		
		Thread.sleep(2000);
		list.selectByValue("USA");					//Volvo
		
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota");					//Toyota
		
		
		//validation step
		
		Assert.assertFalse(list.isMultiple());				//hard assertion
		
	}
	
	
	@Test
	public void verifyDropDown_Multiple() throws Exception {
		
		
		WebElement countrylist = driver.findElement(By.cssSelector("select[name='FromLB']"));					//match ---3  , first one		
		
		
		
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html
		//Select class
		
		Select list = new Select(countrylist);
		
		
		System.out.println("is listbox accept multiple selection or not: " + list.isMultiple());					//true
		
		
		
		
		
		
		Thread.sleep(2000);
		
		//Selection Methods
		//indexing start from 0
		
		list.selectByIndex(1);							//Russia
		
		Thread.sleep(2000);
		list.selectByValue("India");					//India
		
		Thread.sleep(2000);
		list.selectByVisibleText("USA");					//USA
		list.selectByVisibleText("Germany");				//Germany
		
		//validation step
		
		Assert.assertTrue(list.isMultiple());				//hard assertion
		
		
		
		Thread.sleep(4000);
		
		list.deselectByIndex(0);							//USA
		
		Thread.sleep(2000);
		list.deselectByVisibleText("Russia");					//Russia
		list.deselectByValue("Germany");					//Germany
		
		
		
		Thread.sleep(4000);
		list.selectByVisibleText("USA");					//USA
		list.selectByVisibleText("Germany");				//Germany
		
		//DeSelection
		list.deselectAll();
		
		
		Thread.sleep(2000);
		list.selectByValue("India");					//India
		
		
	}
	
	
}
