package com.mercury.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	private static WebDriver driver;
	
	public static void launchBrowser(String browsername)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
	}			
	public static void openApp(String url)
	{
		driver.get(url);
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void verifyOutput(String expectedURL)
	{
		String actualURL=driver.getCurrentUrl();
		boolean status=actualURL.contains(expectedURL);
		Assert.assertEquals(status, true, "\n\nExpected URL:"+expectedURL+"\nBut found Actual URL:"+actualURL );
	}
	
	
}
