package dataDrivenTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NOPCOmmApplication  extends BaseTest{
	

	
	@Test(dataProvider = "regressionData")
	public void verifyLoginWithInVaidCred(String email, String pwd) throws Exception {
		
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		//validation
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
		
	}
	
	
	
	@DataProvider
	public Object[][] sampleData() {
		
		//excel/db
		Object[][] data = { {"Amitha@google.com","demo@123"}, {"Geetha@outlook.com","welcome@123"}, {"Joydeep@gmail.com","welcome@123"}};
		
		return data;
		
	}
	
	
	
	@DataProvider
	public Object[][] regressionData() {
		
		//excel/db
		Object[][] data = { {"AmithaRegression@google.com","demo@123"}, {"GeethaRegression@outlook.com","welcome@123"}, {"JoydeepRegression@gmail.com","welcome@123"}, {"Lavanya@gmail.com","welcome@123"}};
		
		return data;
		
	}
}
