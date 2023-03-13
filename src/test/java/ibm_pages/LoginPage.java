package ibm_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		driver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		

	}

	// identification
//	By txtEmail = By.id("Email");
//	By txtPass = By.cssSelector("input#Password");
//	By chkRem = By.cssSelector("input#RememberMe");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("ogout");
	
	
	
	
	
	@FindBy(id = "Email")
	WebElement txt_Email;
	
	
	@FindBy(how = How.ID, using = "Email")
	WebElement txt_Email1;
	
	
	
	
//	@FindBy(how = How.ID, using="Email")
//	private WebElement email;
//	
//	
//	
//	
//	public void enterOnEmail(String str)
//	{
//		
//	}
	
	
		
	
	
	
	
	@FindBy(css = "input#Password")
	WebElement txt_Pass;
	
	
	@FindBy(css = "input#RememberMe")
	WebElement chk_Rem;
	
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	@FindBy(partialLinkText  = "ogout")
	WebElement btn_Logout;
	
	
	@FindBy(xpath   = "//button[text()='Log in']")
	WebElement btn_Login1;
	
	
	// Actions/Methods

	public void enterEmail(String email) {

		
		System.out.println("=========With Page Factory Concept===============");
		txt_Email.clear();
		txt_Email1.sendKeys(email);
	}

	public void enterPass(String pwd) {

		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);
	}

	public void clickCheckbox() {

		chk_Rem.click();

	}

	public void clickLoginButton() {

		
		System.out.println("click using xpath-----------");
		btn_Login1.click();

	}
	
	public void clickLogoutButton() {

		btn_Logout.click();

	}
	
	
	public void login(String email, String pass) {
		
		enterEmail(email);
		enterPass(pass);
		clickLoginButton();
		
	}
	
	
	
	public void verifyApplicationTitle(String expectedValue) throws Exception {
		
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), expectedValue);
	}

}
