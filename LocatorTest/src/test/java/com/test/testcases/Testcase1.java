package com.test.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.test.pages.WebPageURL;

public class Testcase1 extends BaseClass{
	
	@Test
	public void sampletest()
	{
		System.out.println("success");
	}
	
	@Test
	public void loginTest() throws IOException
	{
		BaseClass.driverInitialise();
		WebPageURL url = new WebPageURL(driver);
		url.testlogin();
		url.userDetails();
		
	}

}
