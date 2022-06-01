package com.mercury.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.mercury.pages.locators.RegisterPageLocators;
import com.mercury.utils.Browser;

public class RegisterPage extends RegisterPageLocators {

	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
    private void clickRegister()
    {
    	WebElement mercury_registerlink=driver.findElement(mercury_registerlink_Locator);
        mercury_registerlink.click();
    }
    private void setFirstName(String fname)
    {
    	WebElement mercury_register_firstname=driver.findElement(mercury_FirstName_Locator);
    	mercury_register_firstname.sendKeys(fname);
    }
    private void setLastName(String lname)
    {
    	WebElement mercury_register_lastname=driver.findElement(mercury_LasName_Locator);
    	mercury_register_lastname.sendKeys(lname);
    }
    private void createUsername(String newusername)
    {
    	WebElement mercury_register_newusername=driver.findElement(mercury_UserName_Locator);
    	mercury_register_newusername.sendKeys(newusername);
    }
    private void createPassword(String newpassword)
    {
    	WebElement  mercury_register_newpassword=driver.findElement(mercury_Password_Locator);
    	mercury_register_newpassword.sendKeys(newpassword);
    }
    private void verifyConfirmPassword(String confirmpassword)
    {
    	WebElement  mercury_register_confirmpassword=driver.findElement(mercury_ConfirmPassword_Locator);
    	mercury_register_confirmpassword.sendKeys(confirmpassword);
    }
    private void clickSubmit()
    {
    	WebElement mercury_submitbutton=driver.findElement(mercury_SubmitButton_Locator);
        mercury_submitbutton.click();
    }
    public void mercuryRegisterNewUser(String fname,String lname,String newusername,String newpassword,String confirmpassword)
    {
    	Reporter.log("Register for new user process started");
    	this.clickRegister();
    	this.setFirstName(fname);
    	this.setLastName(lname);
    	this.createUsername(newusername);
    	this.createPassword(newpassword);
    	this.verifyConfirmPassword(confirmpassword);
    	this.clickSubmit();
    	Reporter.log("submit button clicked and verify now register output page");
    	Browser.verifyOutput("register_sucess");
    	Reporter.log("Sucessfully new user created");
    }
    public void clicksignin()
    {
    	driver.findElement(mercury_signinlink_locator).click();
    }
	
    
}
