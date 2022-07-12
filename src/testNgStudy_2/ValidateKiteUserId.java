package testNgStudy_2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testngpStudy_1.KiteHomePage;
import testngpStudy_1.KitePinPage;
import testngpStudy_1.KiteloginnPage;

public class ValidateKiteUserId extends Base{
	KiteHomePage home;
	KiteloginnPage login;
	KitePinPage pin;
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login= new KiteloginnPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(Utility.readDataFromExcel(0, 0));
	login.sendPassword(Utility.readDataFromExcel(0, 1));
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPin(Utility.readDataFromExcel(0, 2));
	pin.clickOnContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	 public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(0, 0),"Actual and Expected are not matching TC is failed");
	 
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
