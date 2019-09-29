package objectacess;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectRead {

	public static Properties ReadObject() {
		// TODO Auto-generated method stub

		Properties prop= null;
		try
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\HybridSelenium\\src\\test\\java\\objects\\objects.properties");
			prop= new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty("url"));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prop;
	}

}
