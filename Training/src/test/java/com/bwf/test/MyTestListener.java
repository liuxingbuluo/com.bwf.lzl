package com.bwf.test;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * ���������÷�
 * @author Administrator
 *
 */
public class MyTestListener extends TestListenerAdapter{
  @Override
public void onTestFailure(ITestResult tr) {
	// TODO Auto-generated method stub
	super.onTestFailure(tr);
	System.out.println("����ʧ��");
}
  @Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
		System.out.println("���Գɹ�");
	}
}
