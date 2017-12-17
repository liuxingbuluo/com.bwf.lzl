package com.bwf.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {TestDemo1.class});
		/**
		 * testng中XML的用法，没有插件的情况下
		 */
		List<String> files = new ArrayList<String>();
		files.add("testngDemo.xml");
		XmlSuite suite = new XmlSuite();
		suite.setSuiteFiles(files);
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		testng.setXmlSuites(suites);
		testng.run();
	}

}
