package com.mercury.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.pages.functions.LoginPage;
import com.mercury.pages.functions.RegisterPage;
import com.mercury.utils.Browser;
import com.mercury.utils.ReadData;

public class TC_002 {

	WebDriver driver;
	@BeforeMethod(groups="smoke")
	public void setup() throws Exception
	{
		String browsername=ReadData.getData("browserdata", "browser1");
		String url=ReadData.getData("browserdata", "url");
		
	    Browser.launchBrowser(browsername);
		Browser.openApp(url);
	}
	@AfterMethod
	public void teardown()
	{
		Browser.closeBrowser();
	}
	@Test(groups="sanity")
    public void verifyMercuryLogin() throws Exception
    {
		String browsername=ReadData.getData("logindata", "username");
		String url=ReadData.getData("logindata", "password");
		
    	LoginPage login=new LoginPage(driver);
    	login.mercuryLogin(browsername, url);
    }
	@Test(groups="smoke")
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
