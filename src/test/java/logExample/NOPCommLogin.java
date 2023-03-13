package logExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest {

	@Test
	public void verifyLoginWithValidCrednetails() {
		
		
		log.info("Test case execuution in progress : verifyLoginWithValidCrednetails");
		
		
		log.info("before login application title: " + driver.getTitle());
		
		
		
		log.info("clear the email");
		driver.findElement(By.id("Email")).clear();
		log.info("enter email: " + conf.getEmail());
		driver.findElement(By.id("Email")).sendKeys(conf.getEmail());
		
		
		log.info("clear the password");
		driver.findElement(By.className("password")).clear();
		
		log.info("enter password: " + conf.getPassword());
		driver.findElement(By.className("password")).sendKeys(conf.getPassword());
		
		log.info("click on RememberMe checkbox");
		driver.findElement(By.name("RememberMe")).click();
		
		log.info("click on login button");
		driver.findElement(By.tagName("button")).click();
		
		log.info("after login application title: " + driver.getTitle());
		
		
		
		
		log.info("click on logout button");
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		
		log.info("after logout application title: " + driver.getTitle());
	}

}
