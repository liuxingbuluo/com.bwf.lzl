package com.bwf.ecshop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bwf.page.UserPage;
import com.bwf.page.MainPage;
import com.bwf.util.BaseTest;
import com.bwf.util.TestDataFactory;

public class Login_Test extends BaseTest{
	
	@Test(dataProvider="loginTestData" ,dataProviderClass=TestDataFactory.class)
	public void Test_login_success(String username,String password,String expectedText) {
		//1������ҳ
		driver.get("http://localhost/ecshop");
		//2�������¼����
		MainPage main = new MainPage(driver);
		main.login_click();
		//3����д�û���������
		UserPage userpage = new UserPage(driver);
		userpage.InputUsername(username);
		userpage.InputPassword(password);
		//4��������̵�¼��ť
		userpage.Login_Click();
		//5���ж��Ƿ��¼�ɹ�
		if("".equals(username)||"".equals(password)) {
			userpage.getAlert(driver, expectedText);
		}else {
			userpage.getTextResult(expectedText);
		}
	}
}
