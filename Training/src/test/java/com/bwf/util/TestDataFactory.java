package com.bwf.util;

import org.testng.annotations.DataProvider;

public class TestDataFactory {
	@DataProvider(name="loginTestData")
	public static Object[][] loginDataCreate(){
		/*return new Object[][] {
			{"liang123","admin123","��¼�ɹ�"},
			{"liang123","","���벻��Ϊ��"},
			{"sdfa","342","�û������������"}
		};*/
		Object[][] obj = ReadExcel.getDataFromExcel("loginTestData.xlsx", "sheet1");
		return obj;
	}
	@DataProvider(name="registerTestData_tips")
	public static Object[][] RegDataCreate(){
		Object[][] object = ReadExcel.getDataFromExcel("registerTestData.xlsx", "sheet1");
		return object;
	}
	@DataProvider(name="registerTestSuccessData")
	public static Object[][] RegDataSuccess(){
		Object[][] object = ReadExcel.getDataFromExcel("registerTestData.xlsx", "sheet2");
		return object;
	}
}
