package com.DemoTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EnterUserId {

	@Parameters({"browser","url"})
	@Test(groups="uid")
	public void enteruid(String br,String url)
	{
		System.out.println("enteruid-parameter is:"+br);
		System.out.println("enteruid-parameter is:"+url);
	}
}
