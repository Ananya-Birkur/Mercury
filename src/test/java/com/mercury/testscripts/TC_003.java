package com.mercury.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mercury.pages.functions.LoginPage;
import com.mercury.pages.functions.RegisterPage;
import com.mercury.utils.Browser;
import com.mercury.utils.ReadData;

public class TC_003 {

	WebDriver driver;
	@BeforeClass(groups="smoke")
	public void setup() throws Exception
	{
		String browsername=ReadData.getData("browserdata", "browser1");
		String url=ReadData.getData("browserdata", "url");
		
	   Browser.launchBrowser(browsername);
		Browser.openApp(url);
	}
	@AfterClass(groups="smoke")
	public void teardown()
	{
		Browser.closeBrowser();
	}
	@Test(priority=1,groups="smoke")
    public void verifyMercuryLogin() throws Exception
    {
		String browsername=ReadData.getData("logindata", "username");
		String url=ReadData.getData("logindata", "password");
		
    	LoginPage login=new LoginPage(driver);
    	login.mercuryLogin(browsername, url);
    }
	@Test(priority=2,groups="sanity")
	public void verifyMercuryCreatenewuserRegistration() throws Exception
	{
		String fname=ReadData.getData("newuserdata", "firstname");
		String lname=ReadData.getData("newuserdata", "lastname");
		String newusername=ReadData.getData("newuserdata","username");
		String newpassword=ReadData.getData("newuserdata","password");
		String confirmpassword=ReadData.getData("newuserdata","confirmpassword");
	    RegisterPage reg=new RegisterPage(driver);
	    reg.mercuryRegisterNewUser(fname, lname, newusername, newpassword, confirmpassword);
	}
}
