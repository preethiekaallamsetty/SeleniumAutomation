package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputbox  extends BaseTest{
	
	
//	WebDriver driver ;
//	
//	@Before
//	public void launchApp() throws Exception {
//		
//		System.out.println("launching app");
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(5000);
//		
//	}
//
//	
//	@After
//	public void closeApp() throws Exception {
//		
//		System.out.println("closing app");
//		Thread.sleep(5000);
//		driver.close();
//		//driver.quit();
//	}
//	
	
	@Test
	public void verifyInputbox() {
		
		//tagname      or    //tagname[@att='value']     or    //tagname[@att="value"]    or     //*[@att='value']
		
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter name here....");
		
		
	}
}
