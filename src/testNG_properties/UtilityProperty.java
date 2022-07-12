package testNG_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityProperty {
	//public static void captureScreenshot(WebDriver driver, String TCID)
	//{
	//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File dest= new File("C:\\Software testing\\Selenium\\screenshot"+neha+".png");
	//FileHandler.copy(src, dest);
	//}
	public static String getDataFromPropertyFile(String key) throws IOException
	{
	Properties prop= new Properties();
	
	// created object of properties 
	FileInputStream myfile= new FileInputStream("C:\\Software testing\\Selenium\\Selenium_automation\\property.properties");
	prop.load(myfile);
	String value = prop.getProperty(key);
	return value; 
	}

}
