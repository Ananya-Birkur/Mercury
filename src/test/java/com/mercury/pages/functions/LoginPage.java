package com.mercury.pages.functions;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.mercury.pages.locators.LoginPageLocators;
import com.mercury.utils.Browser;

public class LoginPage extends Browser {
 
	private WebDriver driver;
   
	 public LoginPage(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
    private void setusername(String uname)
	{
		driver.findElement(LoginPageLocators.mercury_username_locator).sendKeys(uname);
	}	
	private void setpassword(String pass)
	{
		driver.findElement(LoginPageLocators.mercury_password_locator).sendKeys(pass);
	}
	private void clicksubmit()
	{
		driver.findElement(LoginPageLocators.mercury_submit_locator).click();
	}
	public void mercuryLogin(String uname,String pass)
	{
		Reporter.log("Mercury Login Execution Started");
		this.setusername(uname);
		this.setpassword(pass);
		this.clicksubmit();
		Reporter.log("Mercury Submit Button Clicked and now Verifying Output");
		Browser.verifyOutput("login_sucess");
		Reporter.log("Mercury Login Successful");
	}
	
	
	
	
	
	
	
	
	
	
	
}
