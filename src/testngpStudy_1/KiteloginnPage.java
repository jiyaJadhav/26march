package testngpStudy_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteloginnPage {
	// 1.data members
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	//2. constructor
	public KiteloginnPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3. methods
	public void sendUserName(String UserName)
	{ userName.sendKeys(UserName);
	}
	public void sendPassword(String passWord)
	{
	password.sendKeys(passWord);
	}
	public void clickOnLoginButton()
	{
	loginButton.click();
	}

}
