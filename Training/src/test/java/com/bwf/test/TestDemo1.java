package com.bwf.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo1 {
	@BeforeSuite
	public void beforesuiteM() {
		System.out.println("*****test start******");
	}
	@AfterSuite
	public void aftersuiteM() {
		System.out.println("*****test end******");
	}
	@BeforeTest
	public void beforetestM() {
		System.out.println("-----before test1------");
	}
	@AfterTest
	public void aftertestM() {
		System.out.println("-----after test1------");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("-----before class  in testDemo1-----");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("-----after class  in testDemo1-----");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("-----beforemethod in testDemo1-----");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("-----aftermethod in testDemo1-----");
	}
	@Test(dependsOnGroups="firstlevel")
	public void myTest1Function() {
		System.out.println("---->this is test method: myTest1.1Function");
	}
	@Test(groups= {"secondlevel"})
	public void myTest2Function() {
		System.out.println("---->this is test method: myTest1.2Function");
	}
}
