package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.testcases.BaseClass;

public class WebPageURL extends BaseClass {

	
	public WebPageURL(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void testlogin()
	{
		driver.get("https://selectorshub.com/xpath-practice-page/");
	}
}
