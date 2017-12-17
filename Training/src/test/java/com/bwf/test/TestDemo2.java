package com.bwf.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo2 {
	@BeforeClass
	public void beforeclass() {
		System.out.println("-----before class  in testDemo2-----");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("-----after class  in testDemo2-----");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("-----beforemethod in testDemo2-----");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("-----aftermethod in testDemo2-----");
	}
	@Test(groups= {"firstlevel"})
	public void testFunction2() {
		System.out.println("----->test method : testFunction2.1");
	}
}
