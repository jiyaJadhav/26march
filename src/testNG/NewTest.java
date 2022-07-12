package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void mymethod() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		
  }
  
  @Test
  public void MYmethod()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		
	  
  }
}
