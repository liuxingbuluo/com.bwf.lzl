package com.bwf.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo4 {
	@Test
	public void myTest1Function() {
		for(int i=0;i<10;i++) {
			System.out.println((i % 2 ==0)==true);
		}
	}
	@Test(dependsOnMethods="hello")
	public void myTest2Function() {
		for(int i=0;i<10;i++) {
			System.out.println((i % 2 ==0)==true);
		}
	}
}
