package com.bwf.util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.util.ServiceUtil;

public class BaseTest {
	public	WebDriver driver;
	@BeforeMethod
	public void getDriver() {
		System.setProperty("bwf.test.browser", "firefox");
		driver = ServiceUtil.getDriver();
	}
	@AfterSuite
	public void EndService() {
		ServiceUtil.stopService();
	}
	@AfterMethod
	public void EndDriver() {
		driver.quit();
	}
}
