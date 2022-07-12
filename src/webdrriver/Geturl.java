package webdrriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.close();

	}

}
