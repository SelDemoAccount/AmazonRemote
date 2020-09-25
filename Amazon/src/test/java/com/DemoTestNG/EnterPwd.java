package com.DemoTestNG;

import org.testng.annotations.Test;

public class EnterPwd {
	
	@Test(dependsOnGroups = "uid")
	public void enterpwd()
	{
		System.out.println("Entered password");
	}
	

}
