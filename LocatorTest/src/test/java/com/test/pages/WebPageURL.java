package com.test.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.testcases.BaseClass;

import Wrapper.Wrapperclass;

public class WebPageURL extends BaseClass {

	
	public WebPageURL(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='userform']//following::input")
	WebElement userName;
	
	@FindBy(xpath ="//div[@class='content block panel check-height  parent-inline-cont']//descendant::input")
	WebElement psw;
	
	public void testlogin()
	{
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	
	public void userDetails() throws IOException
	{
		//try {
		String email = Wrapperclass.configurationDetails("Email");
		userName.sendKeys(email);
		String psw1 =  Wrapperclass.configurationDetails("Password");
		psw.sendKeys(psw1);
		//}
		//catch(Exception e)
		//{
			//System.out.println("Exception occurs");
		//}
		//finally {
			//Wrapperclass.screenShot(driver, "test1");
			
		//}
		
	}
}
