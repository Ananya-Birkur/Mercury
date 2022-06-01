package com.mercury.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.pages.functions.LoginPage;
import com.mercury.utils.Browser;
import com.mercury.utils.ReadData;

public class TC_004 {

	WebDriver driver;
	@BeforeMethod(groups="smoke")
	public void setup() throws Exception 
	{
		String browsername=ReadData.getData("browserdata", "browser1");
		String url=ReadData.getData("browserdata", "url");
		
	   Browser.launchBrowser(browsername);
		Browser.openApp(url);
	}
	@AfterMethod(groups="smoke")
	public void teardown()
	{
		Browser.closeBrowser();
	}
	@Test(dataProvider="mercuryloginInfo",groups="smoke")
    public void verifyMercuryLogin(String browsername,String url) throws Exception
    {
		
    	LoginPage login=new LoginPage(driver);
    	login.mercuryLogin(browsername, url);
    }
	@DataProvider(name="mercuryloginInfo")
	public Object[][] logindata()
	{
		Object info[][]=new Object[][]
				{
			{"mercury","mercury"},
			{"ananyabirkur","ananya123"},
			{"vikas","vikas123"},
			{"rakesh","rakesh123"},
			    };
		
		return info;
		
		
		
	}
}
