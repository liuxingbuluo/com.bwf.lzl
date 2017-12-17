package com.bwf.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo3 {
	@BeforeTest
	public void beforetestM() {
		System.out.println("-----before test2------");
	}
	@AfterTest
	public void aftertestM() {
		System.out.println("-----after test2------");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("-----before class  in testDemo3-----");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("-----after class  in testDemo3-----");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("-----beforemethod in testDemo3-----");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("-----aftermethod in testDemo3----");
	}
	@Test
	public void myTest1Function() {
		System.out.println("---->this is test method: myTest3.1Function");
	}
	@Test(enabled=false)
	public void myTest2Function() {
		System.out.println("---->this is test method: myTest3.2Function");
	}
}
