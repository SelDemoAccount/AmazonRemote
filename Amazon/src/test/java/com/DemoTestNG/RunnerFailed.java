package com.DemoTestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class RunnerFailed {

	@AfterTest
	public void runFailedTestCases()
	{
	TestNG obj = new TestNG();
	List<String> list=new ArrayList<String>();
	list.add("F:\\POM\\Amazon\\test-output\\testng-failed.xml");
	obj.setTestSuites(list);
	obj.run();
	}
	
}
