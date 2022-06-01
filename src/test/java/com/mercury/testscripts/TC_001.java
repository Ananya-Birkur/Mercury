package com.mercury.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.pages.functions.LoginPage;
import com.mercury.utils.Browser;
import com.mercury.utils.ReadData;

public class TC_001 {

	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		String browsername=ReadData.getData("browserdata", "browser");
		String url=ReadData.getData("browserdata", "url");
		Browser.launchBrowser(browsername);
		Browser.openApp(url);
	}
	@AfterMethod
	public void teardown()
	{
		Browser.closeBrowser();
	}
	@Test
	public void verifyMercuryLogin() throws Exception
	{
		String browsername=ReadData.getData("logindata", "username");
		String url=ReadData.getData("logindata", "password");
		LoginPage log=new LoginPage(driver);
		log.mercuryLogin(browsername, url);
	}
}
