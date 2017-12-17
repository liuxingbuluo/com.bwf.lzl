package com.bwf.ecshop;

import org.testng.annotations.Test;

import com.bwf.page.MainPage;
import com.bwf.page.UserPage;
import com.bwf.util.BaseTest;
import com.bwf.util.TestDataFactory;

public class RegisterTest extends BaseTest{
		@Test(dataProvider="registerTestData_tips", dataProviderClass = TestDataFactory.class)
		public void register_test(String contents,String expectedresult) throws InterruptedException {
			String [] con_arr = contents.split(",");
			String [] exp_arr = expectedresult.split(",");
			//	1、打开首页
			driver.get("http://localhost/ecshop");
			//	2、点击免费注册链接
			MainPage main = new MainPage(driver);
			main.register_click();
			//	3、填写必填项
			UserPage userpage = new UserPage(driver);
			for(int i=1;i<=con_arr.length;i++) {
				userpage.input_reg_info(i, con_arr[i-1]);
			}
			for(int i=1;i<=exp_arr.length;i++) {
				userpage.assert_input_tip(i, exp_arr[i-1]);
			}
			//	4、点击注册按钮
//			userpage.Register_Submit_Click();
		}
		
		@Test(dataProvider="registerTestSuccessData",dataProviderClass = TestDataFactory.class)
		public void register_test_success(String username, String email,String password,String con_password,String cellphone,String expectedText) {
			driver.get("http://localhost/ecshop/");
			MainPage main = new MainPage(driver);
			main.register_click();
			UserPage userPage = new UserPage(driver);
			userPage.input_reg_info(1,username);
			userPage.input_reg_info(2,email);
			userPage.input_reg_info(3,password);
			userPage.input_reg_info(4,con_password);
			userPage.input_reg_info(5,cellphone);
			userPage.Register_Submit_Click();
			userPage.getTextResult(expectedText);
		}

}
