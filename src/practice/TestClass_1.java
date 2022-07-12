package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_1 {

	public static void main(String[] args) {
		
		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver","C:\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//launch google web  page
		driver.get("https://www.google.com/");
		
		//get title of webpage
		String title=driver.getTitle();
		System.out.println("page title is "+title);
		// OR
		System.out.println("get page title is "+driver.getTitle());
		
		//get url of webpage
		System.out.println("get url of webpage is  "+driver.getCurrentUrl());
		
		//to get page source
		System.out.println(" sourcr of webpage is "+driver.getPageSource());
		 
		//to close webpage
		driver.close();

	}

}
