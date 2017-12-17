package com.bwf.util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.bwf.page.MainPage;
import com.util.ServiceUtil;

public class DriverUtil {
	static {
		WebDriver driver = ServiceUtil.getDriver();
		driver.get("http://localhost/ecshop");
		driver.quit();
		ServiceUtil.stopService();
	}
}
