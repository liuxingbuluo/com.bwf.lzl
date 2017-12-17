package com.bwf.ecshop;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

public class LoginTest_NullPass {
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
			//1������ҳ
			driver.get("http://localhost/ecshop");
			//2�������¼����
			new MainPage(driver).loginElement.click();
			//3����ȷ���û���������Ϊ��
			new UserPage(driver).user_name.sendKeys("liang123");
			new UserPage(driver).user_password.sendKeys("");
			//4��������̵�¼��ť
			new UserPage(driver).login_now.click();
			//5����ʾ����¼���벻��Ϊ�ա�
			String actualText = new UserPage().getAlert(driver);
			assertTrue(actualText.contains("���벻��Ϊ��"));
		}
	

}
