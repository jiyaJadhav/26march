package testngpStudy_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	//2
	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3
	public void validateUserName(String expextedUserID)
	{
	String expextedUserName=expextedUserID;
	String actualUserName = userName.getText();
	if(expextedUserName.equals(actualUserName))
	{
	System.out.println("Actual and Expected User Id are matching TC is passed");
	}
	else {
	System.out.println("Actual and Expected User Id are not matching TC is failed");
	} }
	//to get actual userName
	public String getActualUserName()
	{
	String actualUserName = userName.getText();
	return actualUserName;
	}
	public void logOut() throws InterruptedException
	{
	userName.click();
	Thread.sleep(200);
	logOutButton.click();
	}

}
