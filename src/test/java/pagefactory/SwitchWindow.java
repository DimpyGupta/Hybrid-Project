package pagefactory;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindow {
	
	WebDriver driver= null;
	public String targate;
	public SwitchWindow(WebDriver drive)
	{
		this.driver= drive;
		PageFactory.initElements(driver, this);
	}

	public void WindowSwitch()
	{
		String title = null;
		  Set<String> url = driver.getWindowHandles();
		  //System.out.println(url.size());
		  for(String win: url) 
		  {
			  driver.switchTo().window(win);
			  title = driver.getCurrentUrl();
			 // System.out.println(title);
			  if(title.equals("https://www.naukri.com/"))
			  {
				  targate= driver.getCurrentUrl();
			  }
			  else
			  {
				driver.close();  
			  }
		  }
		  PageFactory.initElements(driver, targate);
	}
}
