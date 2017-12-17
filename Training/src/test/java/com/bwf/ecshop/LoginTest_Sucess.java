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
			//1������ҳ
			driver.get("http://localhost/ecshop");
			//2�������¼����
			new MainPage(driver).loginElement.click();
			//3����д�û���������
			new UserPage(driver).user_name.sendKeys("liang123");
			new UserPage(driver).user_password.sendKeys("admin123");
			//4��������̵�¼��ť
			new UserPage(driver).login_now.click();
			//5���ж��Ƿ��¼�ɹ�
			String arg = new UserPage(driver).login_result_text.getText();
			assertEquals("��¼�ɹ�", arg);
		}
	

}
