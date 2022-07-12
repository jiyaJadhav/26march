package testNgStudy_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Software testing\\Selenium\\chromedriver.exe");
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("incognito");
	driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
