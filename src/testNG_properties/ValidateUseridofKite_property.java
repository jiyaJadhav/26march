package testNG_properties;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testngpStudy_1.KiteHomePage;
import testngpStudy_1.KitePinPage;
import testngpStudy_1.KiteloginnPage;

public class ValidateUseridofKite_property extends base{
	
	KiteHomePage home;
	KiteloginnPage login;
	KitePinPage pin;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	openBrowser();
	login=new KiteloginnPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
	login.sendUserName(UtilityProperty.getDataFromPropertyFile("UN"));
	login.sendPassword(UtilityProperty.getDataFromPropertyFile("PWD"));
	login.clickOnLoginButton();
	pin.sendPin(UtilityProperty.getDataFromPropertyFile("PIN"));
	pin.clickOnContinueButton();
	}
	@Test
	 public void validateUserID() throws IOException 
	{
	Assert.assertEquals(home.getActualUserName(), 
	UtilityProperty.getDataFromPropertyFile("UN"));
	
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
}
