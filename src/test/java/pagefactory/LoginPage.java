package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver= null;
	
	@FindBy(linkText="Login")
	WebElement login;
	
	public LoginPage(WebDriver drive)
	{
		this.driver= drive;
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		login.click();
	}


}
