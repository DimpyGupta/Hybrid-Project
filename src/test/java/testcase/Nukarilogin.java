package testcase;

import org.testng.annotations.Test;

import objectacess.ObjectRead;
import pagefactory.HomePage;
import pagefactory.LoginPage;
import pagefactory.SwitchWindow;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Nukarilogin {
	
	WebDriver drive=null;
	Properties pro= null;
	
	
	@Test (priority=0)
	public void home() 
	{
		HomePage home = new HomePage(drive);
		//home.nukari();
	}
	/*@Test (priority=1)
	public void switchwin()
	{
		SwitchWindow win= new SwitchWindow(drive);
		win.WindowSwitch();
	}
  */
	@Test (priority=2)
	public void login()
	{
		LoginPage log= new LoginPage(drive);
		log.login();
	}
  
  @BeforeTest
  public void beforeTest() {
	  drive= new ChromeDriver();
	  pro= ObjectRead.ReadObject();
	  drive.get(pro.getProperty("url"));
  }

}
