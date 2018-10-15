package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("enter URL");	
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login method");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close Browser");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Report");
	}

}
