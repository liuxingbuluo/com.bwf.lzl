package com.bwf.ecshop;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bwf.page.UserPage;
import com.bwf.page.MainPage;
import com.util.ServiceUtil;

public class LoginTest_WrongPass {
		WebDriver driver=null;
		@BeforeSuite
		public void StartService() {
			driver = ServiceUtil.getDriver();
		}
		@AfterSuite
		public void EndService() {
			ServiceUtil.stopService();
		}
		@AfterTest
		public void EndDriver() {
			driver.quit();
		}
		// TODO Auto-generated method stub
		@Test
		public void login_NullPass() {
			//1、打开首页
			driver.get("http://localhost/ecshop");
			//2、点击登录链接
			new MainPage(driver).loginElement.click();
			//3、正确的用户名，错误的密码
			new UserPage(driver).user_name.sendKeys("liang123");
			new UserPage(driver).user_password.sendKeys("sdafa");
			//4、点击立刻登录按钮
			new UserPage(driver).login_now.click();
			//5、提示“用户名或密码错误”
			String arg = new UserPage(driver).login_result_text.getText();
			assertEquals("用户名或密码错误", arg);
		}
	

}
