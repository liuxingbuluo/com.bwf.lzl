package com.bwf.ecshop;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bwf.page.UserPage;
import com.bwf.page.MainPage;
import com.util.ServiceUtil;

public class LoginTest_Sucess {
		// TODO Auto-generated method stub
		@Test
		public void login_Sucess() {
			//1¡¢´ò¿ªÊ×Ò³
			driver.get("http://localhost/ecshop");
			//2¡¢µã»÷µÇÂ¼Á´½Ó
			new MainPage(driver).loginElement.click();
			//3¡¢ÌîÐ´ÓÃ»§Ãû£¬ÃÜÂë
			new UserPage(driver).user_name.sendKeys("liang123");
			new UserPage(driver).user_password.sendKeys("admin123");
			//4¡¢µã»÷Á¢¿ÌµÇÂ¼°´Å¥
			new UserPage(driver).login_now.click();
			//5¡¢ÅÐ¶ÏÊÇ·ñµÇÂ¼³É¹¦
			String arg = new UserPage(driver).login_result_text.getText();
			assertEquals("µÇÂ¼³É¹¦", arg);
		}
	

}
