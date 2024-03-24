package com.test.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void driverInitialise()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	

}
