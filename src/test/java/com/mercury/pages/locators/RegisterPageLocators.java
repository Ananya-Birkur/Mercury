package com.mercury.pages.locators;

import org.openqa.selenium.By;

public class RegisterPageLocators {

	protected By mercury_registerlink_Locator=By.xpath("//a[@href='register.php'][contains(.,'REGISTER')]");
	protected By mercury_FirstName_Locator=By.xpath("//input[contains(@name,'firstName')]");
	protected By mercury_LasName_Locator=By.xpath("//input[contains(@name,'lastName')]");
	protected By mercury_UserName_Locator=By.xpath("//input[contains(@id,'email')]");
	protected By mercury_Password_Locator=By.xpath("//input[contains(@name,'password')]");
	protected By mercury_ConfirmPassword_Locator=By.xpath("//input[contains(@name,'confirmPassword')]");
	protected By mercury_SubmitButton_Locator=By.xpath("//input[@src='images/submit.gif']");
    protected By mercury_signinlink_locator=By.xpath("//a[@href='login.php'][contains(.,'sign-in')]");


}
