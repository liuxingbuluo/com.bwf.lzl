package com.bwf.test;

import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.self.train.Mytest;

public class ParameterTest {
	
	@DataProvider(name="auth")
	public Object[][] getAuth() {
		return new Object[][] {
			{"���˷�","2222222"},
			{"�Ʒ�","3333333"},
			{"¶С��","4444444"}
		};
	}
	@Test(dataProvider="auth")
	public void datatest(String u,String p) {
		System.out.println("name:"+u+",password:"+p);
	}
 

}
