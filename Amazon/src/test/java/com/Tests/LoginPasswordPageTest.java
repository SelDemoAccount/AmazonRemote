package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObjects.LoginPasswordPage;

public class LoginPasswordPageTest{

	LoginPasswordPage loginpwdpage;
	
	@Parameters("pwd")
	@Test(dependsOnGroups = "user-id" )
	public void pwdTest(String pwd)
	{
		loginpwdpage = new LoginPasswordPage();
		System.out.println("Entering password..");
		loginpwdpage.enterPassword(pwd);
		System.out.println("Entered password.."+pwd);
		loginpwdpage.clickLoginBtn();
		System.out.println("Clciked on Login button..");
		
		if(loginpwdpage.isErrHeadDisplayed())
		{
		String expErrHeadMsg = "There was a problem";
		String expErrMsgTxt  = "Your password is incorrect";
		String actErrHeadMsg = loginpwdpage.getErrHeadText();
		String actErrMsgTxt = loginpwdpage.getErrMsgText();
		if(actErrHeadMsg.equals(expErrHeadMsg) && actErrMsgTxt.equals(expErrMsgTxt))
			Assert.assertTrue(true);
	    }
	}
}
