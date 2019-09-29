package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {

		WebDriver driver= null;
		
		
		public HomePage (WebDriver drive)
		{
			this.driver= drive;
			PageFactory.initElements(driver, this);
		}
		

}
