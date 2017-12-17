package com.bwf.test;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * ¼àÌıÆ÷µÄÓÃ·¨
 * @author Administrator
 *
 */
public class MyTestListener extends TestListenerAdapter{
  @Override
public void onTestFailure(ITestResult tr) {
	// TODO Auto-generated method stub
	super.onTestFailure(tr);
	System.out.println("²âÊÔÊ§°Ü");
}
  @Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
		System.out.println("²âÊÔ³É¹¦");
	}
}
